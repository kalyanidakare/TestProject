package Exception;

import java.util.Scanner;

public class Exceptionnestedtrycatch {

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
 static void stringElement(String string, int i)
 {
		System.out.println("Element at the index of string :"+i);
 }

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two number");
int arr[]= {10,20,30,40,50,60,70};
int a=sc.nextInt();
int b=sc.nextInt();
//nested try catch
try {
	divide(a,b);

	try {
try
{
	arrayElement(arr,3);
}
catch(Exception e)
{
	System.out.println(e);
}

stringElement("India",3);
}
	catch(ArrayIndexOutOfBoundsException e)
	{
	e.printStackTrace();
	}
	divide(a,b);
}
	catch(ArithmeticException e)
	{
	e.printStackTrace();	
	}
	
	add(a,b);
	System.out.println("Done with the exception");
}
	

}





	


