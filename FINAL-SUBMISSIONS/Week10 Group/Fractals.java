/*
 * @Authors: Charles Ceccardi, Samual Mitchell, Andrew Martin, Mitchell Oneka
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Fractals extends Application{
	public void start(Stage stage){
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 600, 500);

		//call
		makeSierpinski(pane, 300.0, 30.0, 250.0, 5);

		stage.setTitle("Sierpinski Triangle");
		stage.setScene(scene);
		stage.show();
	}

	public static void makeSierpinski(Pane pane, double x, double y, double side, int depth){
		//base case
		if(depth == 0){
			makeEquilateralTriangleAt(pane, x, y, side);
			return;
		}

		//half a side and height
		double half = side / 2;
		double height = Math.sqrt(3) * half;

		//recursive
		makeSierpinski (pane, x - half, y + height, half, depth-1); // Left 
		makeSierpinski (pane, x, y, half, depth-1); // Top 
		makeSierpinski (pane, x + half, y + height, half, depth-1); // Right
	}

	public static void makeEquilateralTriangleAt(Pane pane, double x, double y, double side){
		Polygon poly = new Polygon();

		//get height
		double height = Math.sqrt(3) * (side);

		//Make triangle
		poly.getPoints().addAll(new Double[]{
			x, y,
			x - side, y + height,
			x + side, y + height
		});

		//add triangle to pane
		pane.getChildren().add(poly);
	}

	public static void main(String [] args){
		launch();
	}
}

