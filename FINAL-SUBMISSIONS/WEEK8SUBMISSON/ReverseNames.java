/**
 * Course Name: CS 1131
 * Program Name: Exceptions and File IO
 * Lab Section: L03
 * Group Name: THE SOGGY BISCUITS
 * @Author Mitchell Oneka, Andrew Martin, Charles Ceccardi, Samuel Mitchell
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseNames {
	public static void main (String[] args) {
		File file = new File ("Names.txt");
		ArrayList<String> nameList = new ArrayList<>();

		try {
			Scanner scanner = new Scanner(file);
			int count = 0;
			while (scanner.hasNextLine()) {
				nameList.add(scanner.nextLine());
				count++;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			return;
		}
		Collections.reverse(nameList);
		System.out.println(nameList);
		}
}

