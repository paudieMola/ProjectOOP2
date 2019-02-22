package application;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class startup {
	HBox getHBox() {
		HBox hBox = new HBox(15); //create a new hbox
		
		hBox.setPadding(new Insets(15, 15, 15, 15));//set padding
			Circle circ = new Circle( 50.00);//create the circle. Tried creating a circle, square extends shape object but couldn't add it to the hBox
			Rectangle sq = new Rectangle(100.00, 100.00);//create the square
			circ.setFill(Color.RED);
			sq.setFill(Color.GREEN);
			
		hBox.getChildren().addAll(circ);//add circle and square to the hBox
		hBox.getChildren().addAll(sq);
		
		return hBox;
	  }
}
