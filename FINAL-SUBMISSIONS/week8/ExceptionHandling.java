/* 
 * Reads and returns an int. Throws an exception if bad input.
 * @author Andrew Martin
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                scanner.close();
                number = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Input does not match what was expected.");
            }
        }
        scanner.close();
        System.out.println("You entered: " + number);
    }
}
