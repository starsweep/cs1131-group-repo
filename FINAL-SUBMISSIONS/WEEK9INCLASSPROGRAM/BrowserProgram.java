/*
 * @ Aurthors: 
 * Samuel Mitchell 
 * Andrew Martin
 * Charles Ceccardi
 * Mitchell Oneka
 *
 *
 *
 *
 */
// IMPORTS
// These are some classes that may be useful for completing the project.
// You may have to add others.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebHistory.Entry;
import javafx.stage.Stage;
import javafx.concurrent.Worker.State;
import javafx.concurrent.Worker;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The main class for BrowserProgram. BrowserProgram constructs the JavaFX window and
 * handles interactions with the dynamic components contained therein.
 */
public class BrowserProgram extends Application {
	// INSTANCE VARIABLES
	// These variables are included to get you started.
	private Stage stage = new Stage();
	private BorderPane borderPane = new BorderPane();
	private WebView view = new WebView();
	private WebEngine webEngine = new WebEngine();
	private TextField statusbar = new TextField();
	private	String newURL = "";

	// HELPER METHODS
	/**
	 * Retrieves the value of a command line argument specified by the index.
	 *
	 * @param index - position of the argument in the args list.
	 * @return The value of the command line argument.
	 */
	private String getParameter( int index ) {
		Parameters params = getParameters();
		List<String> parameters = params.getRaw();
		return !parameters.isEmpty() ? parameters.get(index) : "";
	}

	/**
	 * Creates a WebView which handles mouse and some keyboard events, and
	 * manages scrolling automatically, so there's no need to put it into a ScrollPane.
	 * The associated WebEngine is created automatically at construction time.
	 *
	 * @return browser - a WebView container for the WebEngine.
	 */
	private WebView makeHtmlView( ) {
		view = new WebView();
		webEngine = view.getEngine();


		return view;
	}

	/**
	 * Generates the status bar layout and text field.
	 *
	 * @return statusbarPane - the HBox layout that contains the statusbar.
	 */
	private HBox makeStatusBar( ) {
		HBox statusbarPane = new HBox();
		statusbarPane.setPadding(new Insets(5, 4, 5, 4));
		statusbarPane.setSpacing(10);
		statusbarPane.setStyle("-fx-background-color: #336699;");
		statusbar = new TextField();
		HBox.setHgrow(statusbar, Priority.ALWAYS);
		statusbarPane.getChildren().addAll(statusbar);
		return statusbarPane;
	}

	// REQUIRED METHODS
	/**
	 * The main entry point for all JavaFX applications. The start method is
	 * called after the init method has returned, and after the system is ready
	 * for the application to begin running.
	 *
	 * NOTE: This method is called on the JavaFX Application Thread.
	 *
	 * @param primaryStage - the primary stage for this application, onto which
	 * the application scene can be set.
	 */
	@Override
	public void start(Stage primaryStage) {
		int windowWidth = 800;
		int windowHeight = 800;
		String defaultURL = "https://www.google.com";

		VBox root = new VBox();
		Scene scene = new Scene(root, windowWidth, windowHeight);
	  makeStatusBar();
		makeHtmlView();

		TextField titleBar = new TextField ();

		// html viewer

		webEngine.load(defaultURL);

		//make buttons
		Button back = new Button("<-");
		back.setMinWidth(30);
		back.setLayoutX(10);
		back.setLayoutY(5);

	  Button forward = new Button("->");
		forward.setMinWidth(30);
		forward.setLayoutX(55);
		forward.setLayoutY(5);

	  Button help = new Button("?");
	  help.setLayoutX(750);
		help.setLayoutY(5);

		//Make address bar
		TextField addressBar = new TextField();
		addressBar.setPrefWidth(999999);
		addressBar.setText(webEngine.getLocation());

		//Creates and sets toolbar
		HBox toolbar = new HBox(10);
		toolbar.setAlignment(Pos.TOP_LEFT);

		toolbar.getChildren().addAll(back, forward, addressBar, help);

		root.getChildren().addAll(toolbar);
		root.getChildren().add(view);

		//Allows view to resize
		VBox.setVgrow(this.view, Priority.ALWAYS);
		
		//setup event listeners90
		addressBar.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
					case ENTER:
						newURL = addressBar.getText();
						if(!newURL.contains("https://")){
							newURL = "https://"+newURL;
							webEngine.load(newURL); 
						}
					break;
				}
			}
		});

		//Give purpose to buttons	
		//Back
		back.setOnAction(e ->{		
				webEngine.getHistory().go(-1);
				addressBar.setText(webEngine.getLocation());
		});

		//Forward
		forward.setOnAction(e -> {
				webEngine.getHistory().go(1);	
				addressBar.setText(webEngine.getLocation());
		});
		// should add a statusbarpane
		root.getChildren().add(makeStatusBar());

		//Help button
		Label helpText = new Label ("Run on Biscuits\n" + "Authors: Samuel Mitchell, Charles Ceccardi, Andrew Martin, Mitchell Oneka\n" + "Course: CS 1131\n" + "Lab Section: L03\n" + "Operations:\n" + "Back Button- Takes you back one page.\n" + "Forward Button- Takes you forward one page.\n" + "Address Bar- Type in the URL of the page you want to visit.");

		helpText.setBackground( new Background( new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		helpText.setTextFill(Color.WHITE);
		
		help.setOnAction( e ->{
			if(helpText.getParent() != root) {
				root.getChildren().add(helpText);
			}
			else if (helpText.getParent() == root) {
				root.getChildren().remove(helpText);
			}
		});
		//set stage
		stage.setTitle("Run On Biscuts");
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * The main( ) method is ignored in JavaFX applications.
	 * main( ) serves only as fallback in case the application is launched
	 * as a regular Java application, e.g., in IDEs with limited FX
	 * support.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		launch(args);
	}
}
