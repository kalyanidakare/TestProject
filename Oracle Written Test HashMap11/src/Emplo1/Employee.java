package Emplo1;

public class Employee implements Comparable<Employee>{
	
	int id,salary;
	String name,dept;
	Profile pr;
	
	Employee(int id,String name,String dept,int salary, Profile pr){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.pr=pr;
		
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary+" "+pr;
	}
	public int compareTo(Employee e) {
		if(this.pr.country.equals(e.pr.country))
			
			return this.pr.state.compareTo(e.pr.country);
else
	return this.pr.country.compareTo(e.pr.country);
	}

}
