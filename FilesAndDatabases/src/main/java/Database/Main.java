package Database;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Handler handler = new Handler();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input directory to search: ");
        DirectoryDump directoryDump = new DirectoryDump(scanner.nextLine());
        directoryDump.dump();
        for (File file : directoryDump.getFiles()) {
            int extStart = file.getName().indexOf(".");
            String st = "INSERT INTO Files VALUES (" + "'" + file.getName() + "'," + "'" + file.getAbsolutePath() + "'," + "'" + file.getName().substring(extStart) + "'," + "'" + Files.size(Path.of(file.getPath())) + "')";
            if (handler.execAction(st)) {
                System.out.println("Information entered");
            } else {
                System.out.println("Information not entered");
            }
        }
        String qu = "SELECT * FROM Files";
        ResultSet rs = handler.execQuery(qu);
    }
}
