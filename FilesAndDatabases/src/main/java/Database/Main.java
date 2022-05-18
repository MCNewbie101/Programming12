package Database;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {
        Handler handler = new Handler();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input directory to search: ");
        DirectoryDump directoryDump = new DirectoryDump(scanner.nextLine());
        directoryDump.dump();
        for (File file : directoryDump.getFiles()) {
            int extStart = file.getName().indexOf(".");
            if (extStart == -1) {
                extStart = file.getName().length();
            }
            int size = (int) Files.size(Path.of(file.getPath()));
            String st = "INSERT INTO FILES VALUES ('" + file.getName() + "', '" + file.getAbsolutePath() + "', '" + file.getName().substring(extStart) + "', " + size + ")";
            if (handler.execAction(st)) {
                System.out.println("Information entered");
            } else {
                System.out.println("Information not entered");
            }
        }
        String qu = "SELECT * FROM FILES";
        ResultSet rs = handler.execQuery(qu);
        while (rs.next()) {
            String name = rs.getString("fileName");
            String path = rs.getString("path");
            String extension = rs.getString("extension");
            int size = rs.getInt("size");
            System.out.println(name + ", " + path + ", " + extension + ", " + size);
        }
        handler.drop();
    }
}
