package Day8Ifforloop;

import java.util.Scanner;
//1
//12
//123
//1234
//12345
public class Printno1to5col11231234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;//4
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+" ");
				
			}
			System.out.println();

	}

}}
