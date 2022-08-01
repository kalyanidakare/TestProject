package Day2;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number ");
        int num1=sc.nextInt();
        int num2=sc.nextInt(); 
		if (num1>num2)
		{
			System.out.println("Number is max"+num1);
		}
		else
		{
			System.out.println("Number is  max"+num2);
			}

	}

}
