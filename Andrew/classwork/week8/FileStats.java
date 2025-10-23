import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileStats {
    public static void main( String[] args ) {
        Scanner inputScanner = new Scanner( System.in );

        String fullText = "";
        int lines = 0;
        long fileLength = 0;
        Boolean scanned = false;

         while ( scanned == false ) {
            System.out.print( "Enter a filename: " );
            String filePath = inputScanner.nextLine();

            File file = new File( filePath );
            fileLength = file.length();

           try ( Scanner scanner = new Scanner( file ) ) {
                while ( scanner.hasNextLine() ) {
                    fullText += scanner.nextLine() + "\n";
                    lines++;
                }
                scanned = true;
            } catch ( FileNotFoundException e ) {
                System.out.println( "File not found. Try again." );
            }
        }

        inputScanner.close();

        if ( fileLength == 0 ) {
            System.out.printf( "characters = %d%n", 0 );
            System.out.printf( "words = %d%n", 0 );
            System.out.printf( "lines = %d%n", 0 );
            System.out.printf( "length = %d%n", 0 );
        } else {
            System.out.printf( "characters = %d%n", fullText.length() - 1);
            System.out.printf( "words = %d%n", fullText.split("\\s").length );
            System.out.printf( "lines = %d%n", lines );
            System.out.printf( "length = %d%n", fileLength );
        }
    }
}
