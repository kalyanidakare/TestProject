package ClassesAndObject;

public class StudentStaticExample {
	int id,marks;
	String name;
	static String colgname="ABC";
	static
	{
		colgname="DYP";
		System.out.println("Static block 1"+colgname);
	}
	static
	
	{
		System.out.println("Static block 2");
	}
	
	StudentStaticExample(int id,String name,int marks)
	{
		
	this.id=id;
	this.name=name;
	this.marks=marks;
	}
	{
		
		id=1;
		marks=80;
		name="kalyani";
		System.out.println("instance block");
	}
//	static void colgname1()//static method
//	{
//		StudentStaticExample s1=new StudentStaticExample(101,"Anjaliu",80);
//		colgname="DYPCOE";
//	     s1.marks=90;
//		System.out.println("College name is:"+colgname);
//		
//	}
	void display() //non static can access both static as well as non static directly
	{
	colgname="DYPCOE";
//	marks=90;
	System.out.println(id+" "+name+" "+marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StudentStaticExample s1=new StudentStaticExample(101,"Anjaliu",80);
     s1.display();
	}

}
