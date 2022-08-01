package Day2;

import java.util.Scanner;

public class Buz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number is divisible 7 or not");
		int n=sc.nextInt();

		if (n%7==0||n%10==7)
		{
			System.out.println("Number is divisible by 7");
		}
		else
		{
			System.out.println("Number is not divisible 7");
			}

	}

}
