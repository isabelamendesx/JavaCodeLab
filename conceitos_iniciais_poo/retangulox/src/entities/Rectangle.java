package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2*(width * height);
	}
	
	public double diagonal() {
		return Math.sqrt(width*width + height*height);
	}
	
	public String toString() {
		return "AREA = " 
		+ String.format("%.2f", area())
		+ String.format("%n")
		+ "PERIMETER = " + String.format("%.2f", perimeter())
		+ String.format("%n")
		+ "DIAGONAL = " + String.format("%.2f", diagonal());
	}
}
