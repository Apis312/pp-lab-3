import geometry.Point;
import geometry.Circle;
import geometry.ColoredCirlce;

public class Main {

	public static void main(String[] args) {
		Point punkt1 = new Point();
		punkt1.setX(5);
		punkt1.setY(6);
		
		double wspX = punkt1.getX();
		double wspY = punkt1.getY();
		
		System.out.println("Współrzędne pliku to:\nx = " + wspX + "\ny = " + wspY);

		
		Circle kolo = new Circle(punkt1);
		System.out.println("Promien kola to " + kolo.getRadius() + "\nPole koła to " + kolo.getArea());
		System.out.println("Obwod kola to " + kolo.calculatePerimeter());
		double[] tab = kolo.getCenter();
		System.out.println("Srodek kola znajduje sie w punkcie x = " + tab[0] + " || y = " + tab[1]);
		
		ColoredCirlce kolorowe = new ColoredCirlce(punkt1);
		System.out.println("Kolor koła to " + kolorowe.getColor());
		
		//Kod przekopiowany z poprzedniego koła - nie kolorowego
		System.out.println("Promien kola to " + kolorowe.getRadius() + "\nPole koła to " + kolorowe.getArea());
		System.out.println("Obwod kola to " + kolorowe.calculatePerimeter());
		tab = kolorowe.getCenter();
		System.out.println("Srodek kola znajduje sie w punkcie x = " + tab[0] + " || y = " + tab[1]);
	}

}
