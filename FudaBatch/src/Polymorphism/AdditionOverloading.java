package Polymorphism;

public class AdditionOverloading {

	void add(int a,int b)
	{
//		System.out.println("Addition of 2 no is:"+(a+b));
	}
void add(int a,int b,int c)
{
	System.out.println("Addition of 3 no is:"+(a+b+c));
}
void add(float a,float b)
{
	System.out.println("Addition of 2 no is:"+(a+b));
}
void add(float a,int b)
{
	System.out.println("Addition of 2 no is:"+(a+b));
}

public static void main(String[] args) {

AdditionOverloading a1=new AdditionOverloading();
a1.add(20,30);
a1.add(20,30,5);
a1.add(20.05f,30.05f);	
	
	
}	
	}


