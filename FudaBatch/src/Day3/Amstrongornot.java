package Day3;

import java.util.Scanner;

public class Amstrongornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
        int n=sc.nextInt();
         
		if (n>=10 && n<1000)
		{
			System.out.println("Number is three digit"+n);
		
		
			int n3=n%10;
			int a=n/10;
			int n1=a/10;
			int n2=a%10;
			int sum=n1*n1*n1*+n2*n2+n3*n3*n3;
		 if (n==sum)
		 {
			System.out.println(" no. is armstrong no"+n);
			}
		 else 
			 System.out.println("not armstrong no"+n);
		 
		}
		else {
			System.out.println("no is not three digit");
		}
	}}
