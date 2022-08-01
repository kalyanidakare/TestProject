package TreeMapimp;

public class Bike {
	int id,year;
	String name,brand;
	
	Bike(int id,String name,String brand,int year){
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.year=year;
		
	}
	public String toString(){
		return id+" "+name+" "+brand+" "+year;
	}
	
	public int compareTo(Bike b) {
		return this.id-b.id;
		//return this.name.compareTo(b.name);
	}
	public boolean equals(Object o)
	{
		Bike b=(Bike)o;
		if(this.id==b.id)
			return true;
		else
			return false;
	}
	
}
