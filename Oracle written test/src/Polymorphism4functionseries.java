
public class Polymorphism4functionseries {
	
	
	double series(double n)
	{
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(1/i);
			
		}
		System.out.println("the sum="+sum);
		return sum;
	}
	
	double series(double a,double n)
	{
		double sum = 0,b=1,c=2;
		for(int i=1;i<=n;i++)
		{
			sum=sum+b/(a*c);
			b+=3;
			c+=3;
			
						}
			System.out.println("Series of a and n="+sum);
			return sum;
		}
	
}
	

	