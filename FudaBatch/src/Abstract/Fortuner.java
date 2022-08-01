package Abstract;

public class Fortuner extends Car{
	
	
	void noofSeats() {
		System.out.println("Innova has 7 seats");

	}
	
	void dashboard() {
		System.out.println("Music system,screen,meter");

	}

	void engine() {
		System.out.println("2800 cc");
	}
public String toString() {
	return "Innova"+" "+brand+" "+price;
}
}
