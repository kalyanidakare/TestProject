package Polymorphism;

public class Polyctrs {

	void area(float r)
	{
		double areaofcircle=3.14*r*r;
		System.out.println("Area of circle:"+areaofcircle);
	}
	void area(float a,float b)
	{
		float areaofrectangle=a*b;
		System.out.println("Area of rectangle:"+areaofrectangle);
	}
	void area(int h,int b)
	{
		float areaoftriangle=(h*b)/2;
		System.out.println("Area of triangle:"+areaoftriangle);
	}
	void area(int a)
	{
		float areaofsquare=a*a;
		System.out.println("Area of square:"+areaofsquare);
	}
public static void main(String[]args) {
	Polyctrs a=new Polyctrs();
	a.area(10.0f);
	a.area(6);
	a.area(4.0f,8.0f);
	a.area(4,5);
}
	
}
