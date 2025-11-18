
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import java.util.List;

public class FractalApp extends Application {

  @Override
  public void start(Stage stage) {
  List<String> args = getParameters().getRaw();
  Pane pane = new Pane();
  pane.setPrefSize(800, 600);
  Scene scene = new Scene(pane, 800, 600, Color.WHITE);
  stage.setScene(scene);
  stage.setTitle("CS1131 Fractal — " + cfg.type.toUpperCase());
  stage.show();
  drawFractal(pane, args);
  }
/**
* STUDENT TASK: Implement one fractal using recursion by adding Shape
nodes to 'pane'.
*/
  private void drawFractal(Pane pane, List<String> args) {
  // TODO: IMPLEMENT ONE of: sierpinski, kochSnowflake, tree, etc.
    Polygon makeSierpinski;
  }
}
