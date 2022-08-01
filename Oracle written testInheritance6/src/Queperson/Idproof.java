package Queperson;


public class Idproof extends Person{
 
	int validity;
	String name,number;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	public String toString() {

		return name + " " +number + " " + validity ;

}
}
