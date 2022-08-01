package Day8Ifforloop;

import java.util.Scanner;

public class palidromornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int temp=num;
		int sum=0;
		
		while(num>0)
		{
	         int rem=num%10;//getting remainder
		     sum=(sum*10)+rem;
		     num=num/10;
		}
		 if(temp==sum)
			System.out.println("palidrome number");
		else
			System.out.println("not palidrome");
		
		}

}
