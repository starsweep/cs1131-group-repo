import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javax.imageio.ImageIO;

public class GraphicsInterpreter extends AbstractGraphicsInterpreter {
   @Override
   public WritableImage loadCommandFile(Stage stage, String fileName) {
      Pane root = (Pane) stage.getScene().getRoot();

      File file = new File(fileName);

      try ( Scanner scanner = new Scanner( file ) ) {
         Color fillColor = Color.rgb(255, 255, 255);
         Color strokeColor = Color.rgb(0, 0, 0);
         while ( scanner.hasNextLine() ) {
            String[] args = scanner.nextLine().trim().split("\\s+");
            switch (args[0]) {
               case "SIZE":
                  stage.setWidth(Double.parseDouble(args[1]));
                  stage.setHeight(Double.parseDouble(args[2]));
               break;
               case "LINE":
                  Line line = new Line(Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]), Double.parseDouble(args[4]));
                  root.getChildren().add(line);
               break;
               case "CIRCLE":
                  Circle circle = new Circle(Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));
                  circle.setFill(fillColor);
                  circle.setStroke(strokeColor);
                  root.getChildren().add(circle);
               break;
               case "RECTANGLE":
                  Rectangle rectangle = new Rectangle(Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]), Double.parseDouble(args[4]));
                  rectangle.setFill(fillColor);
                  rectangle.setStroke(strokeColor);
                  root.getChildren().add(rectangle);
               break;
               case "POLYGON":
                  Polygon polygon = new Polygon();
                  for (int i = 1; i < args.length; i += 2) {
                     polygon.getPoints().addAll(new Double[]{
                        Double.parseDouble(args[i]), Double.parseDouble(args[i + 1])
                     });
                  }
                  polygon.setFill(fillColor);
                  polygon.setStroke(strokeColor);
                  root.getChildren().add(polygon);
               break;
               case "TEXT":
                  //todo, must rewrite command parser (or think of a workaround)
               break;
               case "FILL":
                  fillColor = Color.rgb(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
               break;
               case "STROKE":
                  strokeColor = Color.rgb(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
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
      SnapshotParameters spa = new SnapshotParameters();
      WritableImage output = root.snapshot(spa, null);
      return output;
   }
   @Override
   public void saveImageFile(WritableImage image, String filename){
      File file = new File(filename);
      try {
         ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", file);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   /**
   * The main method
   * @param args
   */
   public static void main(String[] args) {
      launch(args);
   }
}
