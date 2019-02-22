package application;

public class Square extends Shape {
	private double length;
	private double width;
	
	public Square(String colour, double length, double width) {
		super(colour);
		this.length = length;
		this.width = width;
	}
	
	public double getArea(){
		return length*width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidestAngle() {
		return Math.PI/2;
	}
	
	public double getNarrowestAngle() {
		return Math.PI/2;
	}
}
