import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleExceptions {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            Scanner scanner = new Scanner(file);
            int sum = 0;
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
            System.out.println("Sum of numbers: " + sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (InputMismatchException e) {
            System.out.println("File contains non-integer values.");
        }
    }
}
