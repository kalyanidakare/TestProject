package Arrayinjava;

import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Eter"+size +"elements:");

		for(int i=0;i<size;i++)//i=0
		{
			arr[i]=sc.nextInt();//a[0]=100 a[1]=200 a[2]=300 a[3]400 
		}
System.out.println("Enter reverse array");
for(int i=arr.length-1;i>=0;i--) {
	System.out.println(arr[i]+"");
	
}
	}

}
