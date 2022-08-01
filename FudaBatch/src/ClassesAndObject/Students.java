package ClassesAndObject;

public class Students {

	int id,marks; //local variable
	String name,dept,sports;
	
	void setData(int id,String name,String dept,int marks,String s, String sports)
	{
		this.id=id;  //represent the current object i use//this--->s1 s1.id=id(this is represent 
		this.name=name;
		this.dept=dept;
		this.marks=marks;
		this.sports = sports;

	}
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+marks+" "+sports);
	}
void sportsMarks()
{
	if(sports.equals("Badminton"))
	{
		marks=marks+5;
		System.out.println("New Marks are:"+marks);
	}
	else if(sports.equals("Hockey"))
	{
	       marks=marks+3;
	       System.out.println("New Marks are:"+marks);

	}
	else if(sports.equals("khokho"))
	{
		marks=marks+2;
		System.out.println("New Marks are:"+marks);
	}
	else if(sports.equals("Tennis"))
	{
		marks=marks+1;
		System.out.println("New Marks are:"+marks);
	}

//public Str toString();
//{
//	System.out.println(id+" "+name+" "+dept+" "+marks+" "+sports);
//}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student1 s1=new Student1();
 Student1 s2=new Student1();
 
 s1.setData(101, "Rani", "Computer", 70,"Badminton");
// s1.display();
// s1.sportsMarks();
 System.out.println();
 
 s2.setData(102, "Riya", "ENTC", 65,"Tennis");
// s2.display();
// s2.sportsMarks();
 System.out.println();
 
 Student1 s3=new Student1();
 s3.setData(103,"Ramesh","ENTC",65,"No");
// s3.display();
//s3.sportsMarks();
 


	}

}
