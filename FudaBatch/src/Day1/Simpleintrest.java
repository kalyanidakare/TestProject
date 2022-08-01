package Day1;

import java.util.Scanner;

public class Simpleintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p,r,t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the principle:");
	      p=s.nextFloat();
	  	System.out.println("Enter the Rate of interest:");
	       r=s.nextFloat();
	   	System.out.println("Enter the Time period:");
	     t=s.nextFloat();
	float Si;
	Si=p*r*t/100;
	 System.out.println("Calculate Simple interest="+Si); 
		
	}

}
