package HashMAp;

public class Bike {

	int id;
	String name,color;
	
	public Bike(int id,String name,String color){
		this.id=id;
		this.name=name;
		this.color=color;
		
	}
	public String toString(){
		return id+" "+name+" "+color;
	}
	public int hashcode() {
		return id;
	}
	public boolean equals(Object o)
	{
		Bike e=(Bike)o;
		if(this.id==e.id)
			return true;
		else
			return false;
	}

}
