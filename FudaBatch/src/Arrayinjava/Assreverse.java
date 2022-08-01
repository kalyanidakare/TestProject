package Arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class Assreverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array:");
	int size=sc.nextInt();
	System.out.println("Eter"+ size +"elements:");
	int arr[]=new int[size];
	int count=1;
	
	int a[]= {3,90,45,29,37,78};//temp=0=3,1=90,2=45,3=29,4=37,5=78
	                             //reversea[i]=60,50,40,30,20,10
	int n=a.length;//6
	
	for(int i=0;i<n/2;i++)//i=0;i<n/2=(0<3/2)=1
	{
		int temp=a[i];//temp=a[0]=3
		a[i]=a[n-i-1];//a[0]=a[6-0-1]=5
		a[n-i-1]=temp;//a[5]=temp=3
	}
	
			System.out.println("Reverse of Array is:");
			System.out.println(Arrays.toString(a));
		}
	


}
