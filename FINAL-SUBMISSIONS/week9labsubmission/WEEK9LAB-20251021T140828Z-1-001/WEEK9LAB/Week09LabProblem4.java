import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.scene.layout.StackPane;
public class Week09LabProblem4 extends Application {
	@Override
	public void start( Stage stage ) {
		
		double side = 400;
		double location = 0;
		
		double rotation = 0;

		Rectangle rect;

		StackPane root = new StackPane(  );
		
		Scene scene = new Scene( root, 400, 400 ); 	
	
		for ( int i = 0; i <= 20; i++ ){

			rect = new Rectangle(location,location,side,side);

			rect.getTransforms().add(new Rotate(rotation,200,200,0));
	
			rect.setFill(Color.rgb(0, 200, 64));

			rect.setStroke(Color.rgb(0,0,0));

			rect.setStrokeWidth(2);

			side = side*.90;

			rotation += 6.5;
			location += 20-i*1.0005;
		
			root.getChildren( ).add( rect );

		}

        
        stage.setTitle( "Week09LabProblem4" );
        stage.setScene( scene );
        stage.show();
    	}

	public static void main(String[] args){
		launch();
    	}
}
