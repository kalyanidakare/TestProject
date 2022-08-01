package Day3;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sell Amount");
		int amt=sc.nextInt();
		
		if(amt>=10000)
			
		{
			double x=amt*20/100.0;
			System.out.println("The Discount is "+x);
			System.out.println("Net payable amount is"+(amt-x));
		}
		else
		{
			double y=amt*10/100;
			System.out.println("The Discount is"+y);
			
		}
	}

}
