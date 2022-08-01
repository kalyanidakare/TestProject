package Polymorphismcomp;

import java.util.Scanner;

public class CompareOverload {

	void compare(int a, int b) {
		if (a > b) {
			System.out.println("int a  is higher int value" );
		}
		else {
			System.out.println("int b i higher int  value");
		}
	}

	void compare(char x, char y) {
		if (x > y) {
			System.out.println("char x is  higher numeric value");
		}
		else {
			System.out.println("Char y is higher numeric value");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		CompareOverload c = new CompareOverload();
		System.out.println("Enter int a b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		c.compare(a, b);

		System.out.println("Enter char x y");
		char x = sc.next().charAt(0);
		char y = sc.next().charAt(0);
		c.compare(x, y);


	}

}
