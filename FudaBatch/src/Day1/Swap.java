package Day1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int swap;
        int x=5,y=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x and y:");
        x=sc.nextInt();
        y=sc.nextInt();
swap=x;
x=y;
y=swap;

System.out.println("after swapping:"+x);
System.out.println("after swapping:"+y);
	}

}
