import java.util.Scanner;

public class ArrayNullArithmaticexception2 {
	
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
//		String s=null;
		
		
		try {
			divide(a,b);
			arrayElement(arr,6);
			String s=null;//object ref=null;
			s.toString();//ref.toString();
			
		
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)//runtime exception &it throw when apllication 
                             //		try to use an object reference which has null value
		{
			System.out.println(e);
		}
	
	
		System.out.println(" Done ");
	}

	
		
	
		}

	
