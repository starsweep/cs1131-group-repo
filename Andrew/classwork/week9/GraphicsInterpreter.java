import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GraphicsInterpreter extends AbstractGraphicsInterpreter {
   /**
    * The start method. Required by Application
    * @param args
    */
   public void start(Stage stage) {
      Pane root = new Pane( );
      Scene scene = new Scene( root, 400, 300 );

      // Your code goes here.

      stage.setTitle("My JavaFX Application");
      stage.setScene(scene);
      stage.show();
   }

   /**
   * The main method
   * @param args
   */
   public static void main(String[] args) {
      launch(args);
   }
}
