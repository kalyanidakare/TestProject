import java.util.Scanner;

public class Productofdigitanyno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int product=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		while(num!=0)                 
		{
			int r=num/10;              
		
			product=product*(num % 10);
			num=num/10;
		}                                                      
		System.out.println("Product is:"+product);

		
		
		
		
		
		
	}

}
