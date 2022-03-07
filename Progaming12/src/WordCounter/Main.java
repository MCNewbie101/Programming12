package WordCounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WordCounter illiad = new WordCounter();
        Scanner scanner = new Scanner(new File("illiad.txt"));
        while (scanner.hasNext()) {
            illiad.addWords(scanner.nextLine());
        }
        System.out.println(illiad.wordCount());
    }
}
