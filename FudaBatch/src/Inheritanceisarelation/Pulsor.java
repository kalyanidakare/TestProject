package Inheritanceisarelation;

public class Pulsor extends Bike {
	int weight;
	String name, modelno;

	void setPulsorData(String name, int weight, String modelno) {
		this.weight = weight;
		this.modelno = modelno;
		this.name = name;
	}

//	void engine() {
//		System.out.println("220 cc");
//	}
//
//	public String toString() {
//		return name + " " + brand + " " + modelno + " " + milage + " " + weight + "kg" + price + " " + color;
//	}

	void gears()
	{
		System.out.println("Pulsor has 5gears");
	}

	void engine() {
	System.out.println("220 cc");
		
	}
}
