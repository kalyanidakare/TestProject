package Day3;

import java.util.Scanner; 

import javax.net.ssl.SSLContext;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Percent");
int per=sc.nextInt();
if(per>=75)
	System.out.println("U GET DISTINCTION");
else if(per>=60)
	System.out.println("U GOT 1ST CLASS");
else if(per>=50)
	System.out.println("second class");
else
	System.out.println("FAIL");
	}

}
