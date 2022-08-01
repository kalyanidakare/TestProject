package Arrayinjava;

//getter setter method
public class Students {

	int id,marks;
	String name,dept;

     Students(){}
     
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
	void setDept(String dept)
	{
		this.dept=dept;
	}
	int getMarks()
	{
		return marks;
	}
	void setMarks(int marks)
	{
		this.marks=marks;
	}

	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks;
	}
	

}
