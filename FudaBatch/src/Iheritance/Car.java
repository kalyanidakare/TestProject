package Iheritance;

public class Car {
	int id;
	String name,brand;
	Drivercontaintment d;
	
	Car(int id,String name,String brand,Drivercontaintment d)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.d=d;
	}
	public Car(int i, String string, String string2, int j, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}
	public String tostring()
	{
		return id+" "+ brand+" "+name+" "+d;
	}
	


}
