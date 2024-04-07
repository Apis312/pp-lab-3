package geometry;


public class ColoredCirlce extends Circle {
	private String color;

	public ColoredCirlce(Point point) {
		super(point);
		System.out.println("Konstruktor colored circle");
		System.out.println("Podaj kolor koła");
		color = scan.next();		
	}
	
	public String getColor() {
		return color;
	}
	
	
}
