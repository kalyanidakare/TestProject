package Arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class Assreverseitself {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array:");
	int size=sc.nextInt();
	System.out.println("Eter"+ size +"elements:");
	int a[]=new int[size];
//	int count=1;
	
//	int a[]= {3,90,45,29,37,78};//temp=0=3,1=90,2=45,3=29,4=37,5=78
	                             //reversea[i]=60,50,40,30,20,10
	int n=a.length;//6
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	
	
	for(int i=0;i<n/2;i++)//i=0;i<n/2=(0<3/2)=1 //i=90;45
	{
		int c=a[i];//c=a[0]=3     //c=a[1]=90
		a[i]=a[n-i-1];//a[0]=a[6-0-1]=5  //a[6-1-1]=4
		a[n-i-1]=c;//a[6-0-1]=c=5 //a[6-1-1]=4 //temp c
	}
	
			System.out.println("Reverse itself of Array is:");
			System.out.println(Arrays.toString(a));
		}
	
	
}
//[3,90,45,29,37,78]
//=[78,37,29,45,90,3]