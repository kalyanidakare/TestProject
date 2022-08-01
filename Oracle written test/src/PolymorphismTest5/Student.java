package PolymorphismTest5;

public class Student {
	
	int rollno;
	String name;
	Department d;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	

	public String toString()
	{
		return rollno+" "+name+" "+d;
	}

	
	

	

}


