package ClassesandObjectWritten;

import java.util.Scanner;

public class Box {
	
	int length,width,height,volume=0;
	void Box(int l,int w,int h)
	{
		length=l;
		width=w;
		height=h;
		
	}
	void volume() 
	{
		volume=(length*width*height);
//        System.out.println("Volume is " + volume);

	}	
	public String toString() 
	{
	return("volume="+( length*width*height));	
	}

	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int length,width,height,volume=0; //local variable
			Scanner sc=new Scanner(System.in);
				  Box b=new Box();
		      System.out.println("volume of box");
				length=sc.nextInt();
				width=sc.nextInt();
				height=sc.nextInt();
				b.Box(length, width, height);
				System.out.println(b);
			
	}

}
