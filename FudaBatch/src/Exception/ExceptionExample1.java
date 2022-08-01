package Exception;

import java.util.Scanner;
//try with catch block and finally block
public class ExceptionExample1 {

	static void add(int a,int b)
	{
		System.out.println("Addition is:"+(a+b));
	}
	static void divide(int a,int b)
	{
		System.out.println("Division is:"+(a/b));
	}
	static void arrayElement(int arr[],int i)
	{
		System.out.println("Element at the index is:"+arr[i]);
	}
	int getStringLength(String s) 
	{
		if(s==null)
		{
			throw new NullPointerException("String is null");
		}
		return s.length();
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two number");
int arr[]= {10,20,30,40,50,60,70};
int a=sc.nextInt();
int b=sc.nextInt();
try {
	divide(a,b);
	arrayElement(arr,6);
}
catch(ArithmeticException e)
{
//	System.out.println(e);
	e.printStackTrace();
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
finally
{
	System.out.println("Finally block always executes");
	sc.close();
}
arrayElement(arr,6);
add(a,b);
	System.out.println(" Done with the operation ");
}
	}


