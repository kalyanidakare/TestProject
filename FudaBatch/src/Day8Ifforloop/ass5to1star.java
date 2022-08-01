package Day8Ifforloop;

import java.util.Scanner;

public class ass5to1star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;// 5
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		r = sc.nextInt();

//		for(int i=1;i<=r;i++)  //***
		                       //**
		                       //*
		
		for (int i = r; i >= 1; i--) //***
			                         // **
                                     //	 *		                         
			                         
		{
			for (int k = r - i; k >= 1; k--)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}

			System.out.println();

		}

	}
}