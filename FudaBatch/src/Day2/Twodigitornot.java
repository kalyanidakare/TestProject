package Day2;

import java.util.Scanner;

public class Twodigitornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
        int n=sc.nextInt();
         
		if (n>=10 && n<100)
		{
			System.out.println("Number is two digit"+n);
		}
		else
		{
			System.out.println("Number is not two digit"+n);
			}


	}

}
