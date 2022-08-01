package HashMAp;

public class Employee {
	int id;
	String name,dept;
	
	Employee(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public String toString(){
		return id+" "+name+" "+dept;
	}
	public int hashcode() {
		return id;
	}
	public boolean equals(Object o)
	{
		Employee e=(Employee)o;
		if(this.id==e.id)
			return true;
		else
			return false;
	}

}
