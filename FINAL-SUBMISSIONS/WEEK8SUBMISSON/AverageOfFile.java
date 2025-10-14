import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageOfFile{
	public static void main(String [] args){
		try{
			//Make file and scanner
			File file = new File("numbers.txt");
			Scanner scanner = new Scanner(file);

			//starting value
			int sum = 0;
			int run = 0;
	
			//Loop though scanner to add up values
			while(scanner.hasNext()){
				sum += scanner.nextInt();
				run++;
			}

			//Print sum
			System.out.println("Average of the file is: " + (sum/run));
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}
		catch(InputMismatchException e) {
			System.out.println("File contains non-integer values.");
		}
	}
}
