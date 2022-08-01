package Day3;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		 int n=sc.nextInt();

		
		if(n%4==0)
		{
			System.out.println("Leap year"+n);
		}
		else
		{
			System.out.println("not leap year"+n);
		}

	}

}
