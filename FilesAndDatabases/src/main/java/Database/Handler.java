package Database;

import javax.swing.*;
import java.sql.*;

public class Handler {
    private static final String DB_url = "jdbc:derby:database/files;create=true";
    private static Connection connection = null;
    private static Statement stmt = null;

    public Handler () {
        connect();
        createTable();
    }

    private void connect() {
        try {
            connection = DriverManager.getConnection(DB_url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createTable() {
        String TABLE_NAME = "FILES";
        try {
            stmt = connection.createStatement();
            DatabaseMetaData dmn = connection.getMetaData();
            ResultSet tables = dmn.getTables(null, null, TABLE_NAME, null);
            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + " already exists");
            } else {
                String statement = "CREATE TABLE " + TABLE_NAME + " (" + "fileName varchar(200), \n" + "path varchar(2000) primary key, \n" + "extension varchar(20), \n" + "size int)";
                System.out.println(statement);
                stmt.execute(statement);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "setting up database");
        }
    }

    public boolean execAction(String qu) {
        try {
            stmt = connection.createStatement();
            stmt.execute(qu);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error Occurred", JOptionPane.ERROR_MESSAGE);
            System.out.println("Exception at execAction: " + e.getLocalizedMessage());
            return false;
        }
    }

    public ResultSet execQuery(String query) {
        ResultSet resultSet;
        try {
            stmt = connection.createStatement();
            resultSet = stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Exception at query execution");
            return null;
        }
        return resultSet;
    }
}
