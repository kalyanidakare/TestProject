package ClassesAndObject;

import java.util.Scanner;

public class AreaofCircle {
//	int r;
	int rsquare(int r)
	{
		return r*r;
	}
	void area(int r)//r=5
	{
//		in rsq=rsquare(r);
		double area=3.14*rsquare(r);
		System.out.println("area of circle is:"+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of circle:");
int r=sc.nextInt();
AreaofCircle c1=new AreaofCircle();
c1.area(r);//5
sc.close();

	}

}
