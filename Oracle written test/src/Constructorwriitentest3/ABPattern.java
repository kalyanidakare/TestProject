package Constructorwriitentest3;

import java.util.Scanner;

public class ABPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		char ch = 'A';
		int r = sc.nextInt();
		int i, j;

		for (i = r; i >= 1; i--) {
			ch = 'A';
			for (j = i; j >= 1; j--) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		for (i = 1; i <= r; i++) {
			ch = 'A';
			for (j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		System.out.println("Done");
	}

}
