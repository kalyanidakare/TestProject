import java.util.Scanner;

public class ExceptionArrayStringOutofBoun {
	static void arrayIndex(int arr[],int b)
	{
		System.out.println(" the index of array is:"+arr[b]);
		
	}
 static void stringIndex(String string, int b)
 {
		System.out.println(" the index of string :"+b);
 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int arr[]= {10,20,30,40,50,60,70};
		String s="Languages";
		int a=sc.nextInt();
		int b=sc.nextInt();
		//nested try catch
		ExceptionArrayStringOutofBoun ex=new ExceptionArrayStringOutofBoun();
		try {
			ExceptionArrayStringOutofBoun.arrayIndex(arr, b);
			try {
				ExceptionArrayStringOutofBoun.stringIndex(s, b);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
//			ex.stringIndex(s, b);
				
		}catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	System.out.println("Exception Handling done");
	sc.close();
}
	}

