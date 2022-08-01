package AbstractclassInterfaceice4;

public class Mastani implements IceCream, Juice {

	public static void main(String args[]) {
		Mastani m = new Mastani();
		m.drink();
		m.eat();

	}
	

	public void drink() {
		System.out.println(" Juice is a drink");
	}

	public void eat() {
		System.out.println("IceCream is eatable");
	}
	
}

