import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        double sum = 0;
        int count = 0;

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        }

        double average = sum / count;
        System.out.println("Average: " + average);
    }
}
