package Exception;

import java.util.Scanner;

public class Arrayexceptionelement {

	static void arrayElement(int arr[],int i)
	{
		System.out.println("Element at the index is:"+arr[i]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");// 7
		int arr[]= {10,20,30,40,50,60,70};
		int size = sc.nextInt();

		
		try {
		
			arrayElement(arr,size);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		arrayElement(arr,size);
			System.out.println(" Done ");
		}

		
			}


