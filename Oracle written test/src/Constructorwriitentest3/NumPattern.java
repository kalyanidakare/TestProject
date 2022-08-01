package Constructorwriitentest3;

import java.util.Scanner;

public class NumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int r=sc.nextInt();
    
       for(int i=r; i>=1; i--)
        {
       for(int j=r+i; j>=1; j--)
    	{
    	System.out.print(" ");
    	}
       for(int j=i; j<=r; j++)
    	{
    		System.out.println(j);
    	}
       for(int j=r-1; j>=1;j--) 
    	{
    		System.out.print(j);
    	}
    	    System.out.println();
        }
    	    System.out.println("Done");
       }
	   }


