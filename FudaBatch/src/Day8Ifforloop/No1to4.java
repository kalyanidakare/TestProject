package Day8Ifforloop;

import java.util.Scanner;
//1
//2 2
//3 3 3
// 4 4 4 4

public class No1to4 {   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;//4
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				
			}
			System.out.println();

}
}}