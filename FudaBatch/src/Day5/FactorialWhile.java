package Day5;

public class FactorialWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		long fact=1;
		int i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		
		 System.out.println("Factorial of "+ num +" is: "+fact);
		  
	}
    
}
