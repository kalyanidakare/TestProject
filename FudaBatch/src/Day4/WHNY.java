package Day4;

import java.util.Scanner;

public class WHNY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice");
		String input=sc.next();
		//switch (expression) 
		switch(input)
		{
		case "happy":System.out.println("Happy");
		break;
		case "New":System.out.println("New");
		break;
		case "Year":System.out.println("Year");
		break;
		default:
			System.out.println("Welcome");
		}

	}

}
