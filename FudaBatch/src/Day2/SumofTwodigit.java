package Day2;

import java.util.Scanner;

public class SumofTwodigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
        int n=sc.nextInt();
//       int firstdigit=sc.nextInt();
//        int lastdigit=sc.nextInt();
//     
		if (n>=10 && n<=100)
		{
			System.out.println("Number is two digit"+n);
			int lastdigit1=n%10;
			int firstdigit1=n/10;
//			System.out.println(firstdigit+lastdigit);
		}
		else 
		{
			System.out.println("Number is not two digit"+n);
			}

	}

}
