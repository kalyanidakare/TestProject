package Arrayinjava;

import java.util.Scanner;

public class ArrayTranspose {
	
	void displayArray(int a[][], int r, int c)// a=arr
	{
		System.out.println("Elements of array are:");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	void x(int a[][],int c,int r)
	{
	System.out.println("Transpose");
	int x[][]=new int[c][r];
    for(int i=0;i<c;i++)
    {
   	 for(int j=0;j<r;j++)
   	 {
			x[i][j]=a[j][i];
   		 System.out.println(x[i][j]+" ");
   	 }
    }    }
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Eter the row and col:");
		r = sc.nextInt();
		c = sc.nextInt();

		int arr[][] = new int[r][c];
		System.out.println("enter" + (r * c) + "Elements:");
		for (int i = 0; i < r; i++) 
		{
			for (int j = 0; j < c; j++)
			{
				arr[i][j] = sc.nextInt();
				System.out.println(" ");
			}
		

		 

		Array2DExample a1 = new Array2DExample();
		a1.displayArra(arr, r, c);
        
	}

	}
	}

