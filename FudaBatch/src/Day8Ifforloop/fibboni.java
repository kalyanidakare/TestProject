package Day8Ifforloop;

import java.util.Scanner;

public class fibboni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int r = sc.nextInt();

		int a = 0;
		int b = 1;
		for (int i = 1; i <= r; i++)
			
		{

			for (int j = i; j <= i; j++)
//				
//			{
				System.out.print(a+" ");

				int c = a + b;
				a = b;
				b = c;
			}
			System.out.println();
		}

	}

