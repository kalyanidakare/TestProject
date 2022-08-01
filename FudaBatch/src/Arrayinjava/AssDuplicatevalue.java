package Arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class AssDuplicatevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int a = sc.nextInt();
		System.out.println("Eter" + a + "elements:");
		int arr[] = new int[a];

//		int a[]= {3,10,90,78,56,10,78,91,56};//9 //O/P=10

		for (int i = 0; i < a; i++)// given array
		{
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < a - 1; i++) {
			int cnt = 1;
			for (int j = i + 1; j < a; j++) { // 0 1 2 3 4 5 6 7 8
				if (arr[i] == arr[j])
				// int arr //|3 |10 |90 |78 |56 |10 |78 |91 |56|
				{
					cnt++;
				}
			}

		}
		if (a > 1) {
			System.out.println("Duplicate Value:" + arr[a]);

		}

//				int ar[]= {3,10,90,56,10,78,91,56};//9
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

	}

}
