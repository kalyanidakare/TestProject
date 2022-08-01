package Arrayinjava;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no of element:");
   
//   int length=sc.nextInt();
   int arr[]=new int[5];
   
   int max=Integer.MIN_VALUE;
   int min=Integer.MAX_VALUE;
   
   for(int i=0;i<arr.length;i++)
	{
	arr[i]=sc.nextInt();
	}
   for(int i=0;i<5;i++) {
	   if(arr[i]>max) {
		   max=arr[i];
	  }
	   if(arr[i]<min) {
		   min=arr[i];
	   }
   }
   System.out.println("The max and min is:"+max+" "+min);
	}

}
