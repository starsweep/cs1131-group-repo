/**
* Program Name: Problem1
* Course: CS 1131
* Lab Group: L03
* @Author Mitchell Oneka, Andrew Martin, Samuel Mitchell, Charles Ceccardi
* Group Name: THE SOGGY BISCUITS
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;

public class Week09LabProblem1 extends Application {
	@Override
	public void start(Stage stage) {
		Group root = new Group();
		Scene scene = new Scene(root, 400, 300);
		
		//Draws sky
		Rectangle sky = new Rectangle(0, 0, 400, 200);
		sky.setFill(Color.rgb(91, 131, 252));
		root.getChildren().add(sky);

		//Draws ocean	
		Rectangle ocean = new Rectangle(0, 200, 400, 100);
		ocean.setFill(Color.rgb(0, 255, 255));
		root.getChildren().add(ocean);
		
		//Draws island
		Arc island = new Arc(200, 200, 100, 50, 0, 180);
		island.setFill(Color.rgb(255, 246, 163));
		root.getChildren().add(island);

		//Draws Sun
		Circle sun = new Circle(310, 80, 50);
		sun.setFill(Color.rgb(255, 255, 0));
		sun.setStroke(Color.rgb(255, 132, 0));
		sun.setStrokeWidth(1);
		root.getChildren().add(sun);

		stage.setTitle("Week09LabProblem1");
		stage.setScene(scene);
		stage.show();

	}
	public static void main(String[] args) {
		launch();
	}
}
