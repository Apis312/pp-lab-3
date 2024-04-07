import geometry.Point;
import geometry.Circle;
import geometry.ColoredCirlce;
import geometry.Rectangle;

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
		
		
		//zd4
		Circle tablica[] = new Circle[2];  //Rozmiar 2 w celach prezentacji jeśli chcielibyśmy mieć tablicę o dowolnym
		   								   //rozmiarze można by było zastosować ArrayList.add w pętli for
		tablica[0] = kolo;
		tablica[1] = kolorowe;
		
		
		for(Object kolko : tablica) {
			
			if(kolko instanceof ColoredCirlce) {
				ColoredCirlce tymczas = (ColoredCirlce) kolko;
				System.out.println("Obiekt klasy ColoredCircle \nPole to " + tymczas.getArea() + "\nKolor to " + tymczas.getColor() );
				tymczas = null;
			
			}else if(kolko instanceof Circle) {
				Circle tymczas = (Circle) kolko;
				System.out.println("Obiekt klasy Circle \nPole to " + tymczas.getArea() );
				tymczas = null;
			}
		}
		
		//zd 5
		Rectangle prost = new Rectangle(7 , 6.5);
		System.out.println("Obw prostokąta to " + prost.calculatePerimeter() + "\nPole prostokąta to " + prost.calculateArea());
		
	
	}
	
	
}
