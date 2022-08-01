package Day4;

import java.util.Scanner;

public class SwitchStart1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int num=1;
//switch(num)
//{
//case 1:System.out.println(1);
//case 2:System.out.println(2);
//case 3:System.out.println(3);
//case 4:System.out.println(4);
//break;
//
//}
//output=continuosly print no.from 1-5
		
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		switch(num%2)
		{
		case 0:System.out.println("Number is Even");
		break;
		default:System.out.println("Number is ODD");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
