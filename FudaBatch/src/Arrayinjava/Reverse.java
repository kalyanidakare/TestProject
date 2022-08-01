package Arrayinjava;

import java.util.Arrays;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		System.out.println("Eter"+ size +"elements:");
		int a[]=new int[size];
    	int count=1;
		
//    	int a[]= {10,20,30,40,50,60};//temp=0=10,1=20,2=30,3=40,4=50,5=60//1st arr
		                             //reversea[i]=60,50,40,30,20,10
		int n=a.length;//6//2nd arr
		for(int i=0;i<size;i++)//i=0;i<n/2=(0<10/2)=5
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n/2;i++)//i=0;i<n/2=(0<10/2)=5
		{
			int temp=a[i];//temp=a[0]=10
			a[i]=a[n-i-1];//a[0]=a[6-0-1]=5
			a[n-i-1]=temp;//a[5]=temp=10
		}
		
				System.out.println("Reverse of Array is:");
				System.out.println(Arrays.toString(a));
			}
		

	}


