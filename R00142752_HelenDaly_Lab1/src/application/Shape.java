package application;

import javafx.scene.layout.Pane;

abstract public class Shape  {// extends Pane I thought creating shape as a child of pane might allow me to add
	private String colour;					//to the hbox in startup

	public Shape(String colour) {
		this.colour = colour;
	}
	
	public String toString() {
		return colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public abstract double getArea();
	

}
