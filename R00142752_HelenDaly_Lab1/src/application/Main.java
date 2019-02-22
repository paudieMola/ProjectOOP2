package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {//overide start method in application
	 
		BorderPane pane = new BorderPane();//create a border pane
		startup start = new startup();//kick off main program
		
		pane.setTop(start.getHBox());//Create horizontal boxes and put in top of pane
		
	    primaryStage.setScene(new Scene(pane, 300, 250));//create scene and place in stage
	    primaryStage.show();//display the stage
	    }
		
	public static void main(String[] args) {
		launch(args);
	}
}
