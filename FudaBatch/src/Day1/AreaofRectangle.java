package Day1;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float p;
	Scanner s=new Scanner(System.in);
	 System.out.println("Enter length and breadth");

	int length=s.nextInt();
	int	breadth=s.nextInt();	
	int area=length*breadth;
	System.out.println("The area of rectangle="+area);

	 int perimeter;
	 
	 perimeter=2*(length+breadth);
			 
     System.out.println("calculate the perimeter of rectangle="+perimeter);
}
}