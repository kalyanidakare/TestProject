package Arrayinjava;

import java.util.Scanner;

public class ArrayExample1 {
	//even no

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int size=6;
int a[]=new int[size];
Scanner sc=new Scanner(System.in);
System.out.println("Eter"+ size +"elements:");

for(int i=0;i<size;i++)//i=0
{
	a[i]=sc.nextInt();//a[0]=100 a[1]=200 a[2]=300 a[3]400 
}
System.out.println("Elements of array are:");

for (int i=0;i<size;i++)
{
	if(a[i]%2==0)//even number
	System.out.println(a[i]+" ");
}
	}

}
