package Day7;

import java.util.Scanner;

public class greater2765 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;//345
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
		
		while(num!=0)
		{
			int r=num%10;
			if(r>sum)
				{
				sum=r;
				}
			num=num/10;
		}                                                      
		System.out.println("Show Greater Digit:"+sum);
	}

	}


