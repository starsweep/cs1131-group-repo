/**
* Program Name: Program 4
* Program Description: ?
* Course: CS 1131
* Lab Section ?
* Lab Team Name: ?
* @author Andrew Martin
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class Week4Program {
    public static HashMap <String, String> csvParser(String dictPath){
        HashMap <String, String> dict = new HashMap<>();
        File dictFile = new File(dictPath);
        try (Scanner fileReader = new Scanner(dictFile)) {
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                String[] splitData = data.split(",");
                dict.put(splitData[0], splitData[1]);
            }
        } catch (FileNotFoundException exception) {
            System.out.printf("File not found at %s%n", dictPath);
            exception.printStackTrace();
        }
        return dict;
    }

    public static String translator(String sentence, String dictPath){
        HashMap <String, String> dict = csvParser(dictPath);
        sentence = sentence.replaceAll("([\\.,])", " $1 ");
        String[] splitSentence = sentence.split("\\s+");
        String translation = "";
        for (int i = 0; i < splitSentence.length; i++){
            if (dict.get(splitSentence[i].toLowerCase()) == null){
                translation += splitSentence[i].toLowerCase();
            } else {
                translation += dict.get(splitSentence[i].toLowerCase());
            }
            if (i + 1 < splitSentence.length){
                if (splitSentence[i + 1].matches("\\p{Punct}") == false){
                    translation += " ";
                }
            }
        }
        return translation.substring(0, 1).toUpperCase() + translation.substring(1);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sentence to translate: ");
        //"Documents/School/cs1131/cs1131-group-repo/Andrew/classwork/pirate_dictionary.csv"
        System.out.println(translator(input.nextLine(), "pirate_dictionary.csv"));
        input.close();
    }
}
