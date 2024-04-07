package geometry;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double l, double w){
		System.out.println("Konstruktor klasy Rectangle");
		length = l;
		width = w;
	}
	
	public double calculateArea() {
		return (length * width);
	}
	public double calculatePerimeter() {
		return ((length * 2) + (width * 2) );
	}
	

}
