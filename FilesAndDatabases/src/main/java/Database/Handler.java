package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Handler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection connection = null;
    private static Statement stmt = null;

    public Handler () {
        connect();
    }

    private void connect() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbedddDriver").newInstance();
            connection = DriverManager.getConnection(DB_url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
