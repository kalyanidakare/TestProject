package Day4;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 number");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Press 1-Add 2-subtract 3-product 4idivide");
int choice=sc.nextInt();
switch (choice)
{
case 1:int sum=a+b;
System.out.println("sum="+sum);
break;
case 2:int sub=a-b;
System.out.println("sub="+sub);
break;
case 3:int product=a*b;
System.out.println("product="+product);
break;
case 4:int div=a/b;
System.out.println("divide="+div);
default:System.out.println("invalid choice");
}
	}

}
