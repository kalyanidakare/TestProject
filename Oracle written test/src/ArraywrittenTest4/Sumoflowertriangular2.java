package ArraywrittenTest4;

import java.util.Scanner;

public class Sumoflowertriangular2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Eter the row and col:");
		r = sc.nextInt();
		c = sc.nextInt();

		int arr[][] = new int[r][c];
		System.out.println("enter" + (r * c) + "Elements:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (i > j)
					sum = sum + arr[i][j];
			}

		}
		System.out.println("Sum of main diagoal:" + sum);
	}

}
