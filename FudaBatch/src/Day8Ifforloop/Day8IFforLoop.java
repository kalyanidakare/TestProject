package Day8Ifforloop;

import java.util.Scanner;

public class Day8IFforLoop {
//	*  
//	**  
//	***  
//	****  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;// 4
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		r = sc.nextInt();
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++)//
			{
				System.out.print("*");
			}

			System.out.println("  ");
		}

		System.out.println("Done");

	}

}
