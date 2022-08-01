package Day2;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter percentage");
		float mark=sc.nextFloat();
		if(mark>=50)
		System.out.println("per maximum than 50 then  pass");
		else
			System.out.println("per less than 50 then fail");
		
	}

}
