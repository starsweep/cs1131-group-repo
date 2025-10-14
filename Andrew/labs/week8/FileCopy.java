import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("source.txt"));
            PrintWriter writer = new PrintWriter("destination.txt");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.print(line);
            }
            scanner.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
