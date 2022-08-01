package TreeMapimp;

public class Car {
	int price,year;
	String name,brand;
	
	public Car(String name,String brand,int price,int year){
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.year=year;
		
	}
	public String toString(){
		return name+" "+brand+" "+price+" "+year;
	}


}
