import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GraphicsInterpreter extends AbstractGraphicsInterpreter {
   /**
    * The start method. Required by Application
    * @param args
    */
   @Override
   public WritableImage loadCommandFile(Stage stage, String fileName) {
      WritableImage output = new WritableImage(null);
      Pane root = new Pane( );
      Scene scene = new Scene( root, 400, 300 );

      File file = new File(fileName);

      try ( Scanner scanner = new Scanner( file ) ) {
         while ( scanner.hasNextLine() ) {
            String[] splitLine = scanner.nextLine().trim().split("\\s+");
            switch (splitLine[0]) {
               case "SIZE":
               break;
               case "LINE":
               break;
               case "CIRCLE":
               break;
               case "RECTANGLE":
               break;
               case "POLYGON":
               break;
               case "FILL":
               break;
               case "STROKE":
               break;
               case "//":
               break;
               case "END":
               break;
               case "":
               break;
               default:
                  throw new ParseException(null, 0);
            }
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (ParseException e) {
         e.printStackTrace();
      }
      return output;
   }
   @Override
   public void saveImageFile(WritableImage image, String filename){
      //todo
   }

   /**
   * The main method
   * @param args
   */
   public static void main(String[] args) {
      launch(args);
   }
}
