package Arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class AssMinvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		System.out.println("Eter"+ size +"elements:");
		int arr[]=new int[size];		
		

for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
		for(int i=0;i<size;i++)//bubble sort
		{
			for(int j=0;j<size-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		
		System.out.println("Second minimum:"+arr[1]);

//		int ar[]= {-20,0,-25,15,19,37,23};//7
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(ar));

	}

}
//find second minimum no.