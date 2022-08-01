package Day4;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No And Display Month");

		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Jan="+30);
			break;
		case 2:
			System.out.println("Feb="+28);
			break;
		case 3:
			System.out.println("March="+30);
			break;
		case 4:
			System.out.println("April="+31);
			break;
		case 5:
			System.out.println("May="+30);
			break;
		case 6:
			System.out.println("Jun="+31);
			break;
		case 7:
			System.out.println("July="+30);
			break;
		case 8:
			System.out.println("Aug="+31);
			break;
		case 9:
			System.out.println("Sep="+30);
			break;
		case 10:
			System.out.println("Oct="+31);
			break;	
		case 11:
			System.out.println("Nov="+30);
			break;
		case 12:
			System.out.println("Dec="+31);
			break;

		default:
			System.out.println("invalid choice");

		}
	}

	}


