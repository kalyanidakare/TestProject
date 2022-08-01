package ClassesAndObject;

import java.util.Scanner;

public class SimpleInterest {
	
	int pro(int p,int r,int t)
	{
		return p*r*t;
	}
	void Simple(int p,int r, int t)
	{
		double SimpleInterest=pro(p,r,t)/100;
		System.out.println("Simple Interest is:"+SimpleInterest);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the principle,rate of interest,time");
	     int p=s.nextInt();
	      int r= s.nextInt();
	    int t=s.nextInt();
	    SimpleInterest s1=new SimpleInterest();
	    s1.Simple(p, r, t);
        s.close();		
	}

}
