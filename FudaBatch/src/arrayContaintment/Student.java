package arrayContaintment;

public class Student {

	int id,marks;
	String name;
	String contact;
	
	Student(int id,String name,int marks,String contact)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.contact=contact;
		
	}
	public String toString()
	{
		return id+" "+name+" "+marks+" "+contact;
	}
}
