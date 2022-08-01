package ClassesAndObject;

import java.util.Arrays;
import java.util.Scanner;

public class Asscommonelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		System.out.println("Eter" + size + "elements:");
		int arr[] = new int[size];
		int count = 1;

		int ar1[]= {12,23,34,67,78,91,56};
		int ar2[]= {39,25,15,23,55,91,66,22};
		
		int n1=ar1.length;//6
		int n2=ar1.length;//6

		
		for (int i = 0; i <size; i++)// given array
		{
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n1; i++)// bubble sort
		{
			for (int j = i + 1; j <n2; j++) { // 0 1 2 3 4 5 6 7 8
				if (arr[i] == arr[j])
				{
					{
						int temp=arr[j];
						arr[j]=arr[size-1];
					   arr[j+1]=temp;
			}
		}
	}

	System.out.println("Duplicate Value:" + arr[count]);

//			int ar[]= {3,10,90,56,10,78,91,56};//9
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));

}
	}}
