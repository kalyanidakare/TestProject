package Day5;

import java.util.Scanner;

public class VariousThali {

	private static final String Quantity = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Choice Different Thali");

		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Maharashtrian Thali -200/-");
			int quantity1=sc.nextInt();
			int price1=quantity1*200;
			System.out.println("price"+price1);
			break;
		case 2:
			System.out.println("Gujrati Thali-300/-");
			int quantity2=sc.nextInt();
			int price2=quantity2*300;
			System.out.println("price"+price2);

			break;
		case 3:
			System.out.println("Rajastani Thali-350/-");
			int quantity3=sc.nextInt();
			int price3=quantity3*350;
			System.out.println("price"+price3);

			break;
		case 4:
			System.out.println("Punjabi Thali-250/-");
			int quantity4=sc.nextInt();
			int price4=quantity4*250;
			System.out.println("price"+price4);

			break;

		default:
			System.out.println("invalid choice");

	

		}}}
