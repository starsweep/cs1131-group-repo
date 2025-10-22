import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Week09LabProblem3 extends Application {
    public void start( Stage stage ) {
        Group root = new Group( );
        Scene scene = new Scene( root, 400, 300 ); 

	for(int i = 0; i < 25; i++){
	        Polygon poly = new Polygon();
		poly.getPoints().addAll(new Double[]{
			(Math.random() * 400), (Math.random() * 300),
			(Math.random() * 400), (Math.random() * 300),
			(Math.random() * 400), (Math.random() * 300)
		});
    
	        //Triangle Opacity
		poly.setOpacity(Math.random());

        	//Line thickness and color
		poly.setStroke(rgb());
		poly.setStrokeWidth(Math.random() * 20);

		//Color
		poly.setFill(rgb());

		root.getChildren().add(poly);
	}

	stage.setTitle( "Week09LabProblem3" );
        stage.setScene( scene );
        stage.show();
    }

    public static void main(String [] args){
	launch();
    }

    public static Color rgb(){
	int r = (int)(Math.random() * (255));
        int g = (int)(Math.random() * (255));
        int b = (int)(Math.random() * (255));
	
	Color color = Color.rgb(r, g, b);

	return color;
    }

    public static void points(){
		
    }
}
