package Arrayinjava;

public class Employee {
	int id,salary; //local variable
	String name,dept,designation;

	
	
    Employee(){}

    int getId()
	{
		return id;
	}
	void setId(int id)
	{
		this.id=id;
	}

	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}

	String getDept()
	{
		return dept;
	}
	void setdept(String dept)
	{
		this.dept=dept;
	}


	int getsalary()
	{
		return salary;
	}
	void setSalary(int salary)
	{
		this.salary=salary;
	}

	String getDesignation()
	{
		return designation;
	}
	void setdesignation(String designation)
	{
		this.designation=designation;
	}

	public String toString()
	{
		return id+" "+name+" "+salary+" "+dept+" "+designation;
	}
	

    
    
    
    
    
}
