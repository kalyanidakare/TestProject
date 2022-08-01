package Day3;

import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number");
int x1=sc.nextInt();
int x2=sc.nextInt();
//System.err.println("Press 1-add 2-Subtract 3-Multiply 4-divide");
int y=sc.nextInt();
if(y==1)
{
	int z=x1+x2;

	System.out.println("the sum is="+z);
}
else if(y==2)
{
	int z=x1-x2;

	System.out.println("the SUBSTRACT is="+z);
}
else if(y==3)
{
	int z=x1*x2;

	System.out.println("the MULTIPLY is="+z);
}
else if(y==4)
{
	int z=x1%x2;

	System.out.println("the divisible is="+z);
}
else
	System.out.println("Wrong choice");
}

	}


