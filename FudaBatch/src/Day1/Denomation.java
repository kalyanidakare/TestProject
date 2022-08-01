package Day1;

import java.util.Scanner;

public class Denomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//8999
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter amount in rs");
		int amt=sc.nextInt();
		
		int n2000=amt/2000;
		amt=amt%2000;
	    int n500=amt/500;
		amt=amt%500;
		int n200=amt/200;
		amt=amt%200;
		int n100=amt/100;
		amt=amt%100;
		int n50=amt/50;
		amt=amt%50;
		int n20=amt/20;
		amt=amt%20;
		
		System.out.println("Notes of 2000="+n2000);
		System.out.println("Notes of 500="+n500);
		System.out.println("Notes of 200="+n200);
		System.out.println("Notes of 100="+n100);
		System.out.println("Notes of 50="+n50);
		System.out.println("Notes of 20="+n20);

		System.out.println("Remaining amt="+amt);

	}

}
