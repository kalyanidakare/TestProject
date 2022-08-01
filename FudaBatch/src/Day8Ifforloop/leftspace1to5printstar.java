package Day8Ifforloop;

//import java.util.Scanner;

public class leftspace1to5printstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int r;
//		
		for (int i = 1; i <= 4; i++) {
			for (int k = 4; k >= 1; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" *");
			}

		}
		System.out.println();

	}

}
