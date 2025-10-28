/*
 * @author Samuel.L.Mitchell II 
 * cs1131
 * Soggy Biscuits
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileCopy {
    public static void main(String[] args) {
	try{
		File source = new File("source.txt");
	 	File destination =new File("destination.txt");
         	Scanner scanner = new Scanner(source);
        	PrintWriter writer = new PrintWriter(destination);

		
	        while (scanner.hasNextLine()) {
	            	String line = scanner.nextLine();
        	    	writer.println(line);
        	}

       		scanner.close();
		writer.close();
	} catch (FileNotFoundException e){
		System.out.println("File Not Found");
	 	e.printStackTrace();
	}
	


    }
}
