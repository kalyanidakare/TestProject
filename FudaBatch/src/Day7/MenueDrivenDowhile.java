package Day7;

import java.util.Scanner;

public class MenueDrivenDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ch,a,b;
		char c='n';
		
		do {
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("1.Multiplication");
		System.out.println("1.Division");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");
     	ch=sc.nextInt();
		int choice = sc.nextInt();
	

		
		System.out.println("Enter 2 no:");
       a=sc.nextInt();
       b=sc.nextInt();
       
       switch(ch)
       {
       case 1:System.out.println("Addition is:"+(a+b));
       break;
       
       case 2:System.out.println("Subtraction is:"+(a-b));
       break;
  
       case 3:System.out.println("Multiplication is:"+(a*b));
       break;
  
       case 4:System.out.println("Division is:"+(a/b));
       break;
  
  
       }
       System.err.println("Do you want to continue:(y/n):");
       char c1=sc.next().charAt(0);
	}while(c=='y'||c=='y');
	System.out.println("Done");
		
	}

}
