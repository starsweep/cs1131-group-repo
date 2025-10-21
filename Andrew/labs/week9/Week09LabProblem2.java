import java.util.Map;
import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line; 

public class Week09LabProblem2 extends Application {
    public void start( Stage stage ) {
        // initial params
        int width = 800;
        int height = 800;
        int lineWidth = 2;
        int resolution = 25;
        
        // color values for lines
        int redValue = 0;
        int greenValue = 255;
        int blueValue = 0;

        // make scene
        Group root = new Group( );
        Scene scene = new Scene( root, width, height, Color.rgb( 0, 0, 0 ) ); 
        
        /*
        // make guidelines

        Line line1 = new Line( 0, height / 2, width, height / 2 );
        line1.setStroke(Color.rgb( redValue, greenValue, blueValue ) );
        line1.setStrokeWidth( lineWidth );
        root.getChildren().add( line1 );

        Line line2 = new Line( width / 2, 0, width / 2, height );
        line2.setStroke(Color.rgb( redValue, greenValue, blueValue ) );
        line2.setStrokeWidth( lineWidth );
        root.getChildren().add( line2 );
        */

        // make line manager
        Map<String, Line> lineMap = new HashMap<String, Line>();
        
        // Quadrant 1
        for ( int i = 0; i <= width / 2; i += resolution ) {
            lineMap.put( "line1." + i, new Line( i, height / 2, width / 2, ( height / 2 ) - (double)i * ( (double)height / (double)width ) ) );
            Line currentLine = lineMap.get( "line1." + i );
            currentLine.setStroke( Color.rgb( redValue, greenValue, blueValue ) );
            currentLine.setStrokeWidth( lineWidth );
            root.getChildren().add( currentLine );
        }

        // Quadrant 2
        for ( int i = width; i >= width / 2; i -= resolution ) {
            lineMap.put( "line2." + i, new Line( i, height / 2, width / 2, ( height / 2 ) - ( height - (double)i * ( (double)height / (double)width ) ) ) );
            Line currentLine = lineMap.get( "line2." + i );
            currentLine.setStroke( Color.rgb( redValue, greenValue, blueValue ) );
            currentLine.setStrokeWidth( lineWidth );
            root.getChildren().add( currentLine );
        }

        // Quadrant 3
        for ( int i = 0; i <= width / 2; i += resolution ) {
            lineMap.put( "line1." + i, new Line( i, height / 2, width / 2, ( height / 2 ) + (double)i * ( (double)height / (double)width ) ) );
            Line currentLine = lineMap.get( "line1." + i );
            currentLine.setStroke( Color.rgb( redValue, greenValue, blueValue ) );
            currentLine.setStrokeWidth( lineWidth );
            root.getChildren().add( currentLine );
        }

        // Quadrant 4
        for ( int i = width; i >= width / 2; i -= resolution ) {
            lineMap.put( "line2." + i, new Line( i, height / 2, width / 2, ( height / 2 ) + ( height - (double)i * ( (double)height / (double)width ) ) ) );
            Line currentLine = lineMap.get( "line2." + i );
            currentLine.setStroke( Color.rgb( redValue, greenValue, blueValue ) );
            currentLine.setStrokeWidth( lineWidth );
            root.getChildren().add( currentLine );
        }
        
        stage.setTitle( "Week09LabProblem2" );
        stage.setScene( scene );
        stage.show();
    }
}
