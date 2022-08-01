package Day8Ifforloop;

import java.util.Scanner;

//*
//**
//***
//****
//*****
//****
//***
//**
//*

public class Printstar151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;// 5
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		
		for (int row =1; row <= n; row++)
		{
			for (int col =1; col <=row; col++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int row = 1; row <=n; row++) {
			for (int col =n-1; col>=row; col--) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println("Done");

	}

		

}
