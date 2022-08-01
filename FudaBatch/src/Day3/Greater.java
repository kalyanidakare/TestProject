package Day3;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three number ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
		if (num1>num2)
		{
			System.out.println("Number is max"+num1);
		}
		else if(num2>num3)
		{
			System.out.println("Number is  max"+num2);
			
			}
		else if(num3>num1)
		{
			System.out.println("Number is  max"+num3);
		}
		else
		{
			System.out.println("calcultate  number is max");
		}


	}

}
