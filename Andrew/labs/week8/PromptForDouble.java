/*
 * Reads and returns a double. Throws an exception if bad input.
 * @author Andrew Martin
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PromptForDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0.0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an double: ");
                number = scanner.nextDouble();
                scanner.close();
                validInput = true;
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Input does not match what was expected.");
            }
        }
        
        System.out.println("You entered: " + number);
    }
}
