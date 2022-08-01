package Polymorphismcomp;

public class OverloadFuctionSeries {


		double series(double n)
		{
			double sum=0;
			for(int i=1;i<=n;i++) {
				sum=sum+(1/i);
			}
			System.out.println("sum of series n;"+sum);
			return sum;
		}

double series(double a,double n)
{
	double sum=0,b=1,c=2;
	
	for(int i=1;i<=n;i++)//a=2,n=5
	{
sum=sum+b/(a*c);
b+=3;
c+=3;
	}
	System.out.println("sum of series a&n:"+sum);
	return sum;
}
}


