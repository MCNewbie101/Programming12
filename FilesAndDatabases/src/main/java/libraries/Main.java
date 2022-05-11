package libraries;

import java.util.Scanner;
import org.apache.derby.database.Database;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input directory to search: ");
        DirectoryDump directoryDump = new DirectoryDump(scanner.nextLine());
        directoryDump.dump();

    }
}
