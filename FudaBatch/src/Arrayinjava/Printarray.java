package Arrayinjava;

import java.util.Scanner;

//import java.util.Scanner;

public class Printarray {

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
		
//		int[]arr=new int[] {1,2,3,4,5};
		System.out.println("Elements of given array:");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}}