package Day4;

import java.util.Scanner;

public class DisplayDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date And Display Day");

//		System.out.println("Press 1-Sun 2-Mon 3-Tue 4-Wed 5-Thu 6-Fri 7-Sat");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wed");
			break;
		case 5:
			System.out.println("Thus");
			break;
		case 6:
			System.out.println("Fri");
			break;
		case 7:
			System.out.println("Sat");
			break;
		default:
			System.out.println("invalid choice");

		}
	}
}
