package ClassesAndObject;

public class Calculator {
	
	void add()
	{
		int a=10,b=20;//local variables
		System.out.println("Addition is:"+(a+b));
	}
	void substract()
	
	{
		int a=20,b=10;
		System.out.println("Subtraction is:"+(a-b));
	}
	void Multiplication()
	
	{
		int a=10,b=15;
		System.out.println("Multiplication is:"+(a*b));
	}
	void Division()
	
	{
		int a=20,b=5;
		System.out.println("Division is:"+(a/b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator c1=new Calculator();
c1.add();
c1.substract();
c1.Multiplication();
c1.Division();
	}

}
