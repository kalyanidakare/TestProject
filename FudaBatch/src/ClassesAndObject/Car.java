package ClassesAndObject;

public class Car {

	void wheelNo()
	{
		System.out.println("4 wheels");
	
	}
	void dashboard()
	{
		System.out.println("Compulsary for each car");
	}
	void enginCapacity()
	{
		System.out.println("Average engine capacity:1100 cc");;
	}
	void milage()
	{
		System.out.println("milage:20km/ltr");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1=new Car();
	    Car c2=new Car();
	    Car c3=new Car();
	    
	    System.out.println("First Car");
	    c1.enginCapacity();	
	    
	 System.out.println("Second Car:");
	 c2.enginCapacity();
	 c2.milage();
	
	}

}
