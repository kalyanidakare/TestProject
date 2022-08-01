package Arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {

	void swap(int arr[], int size) {
		int pos = size / 2; // {1,2,3,4,5,6,7,8};
		for (int i = 0; i < (size / 2); i++) {
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
			pos++;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter aaray size");// 7
		int size = sc.nextInt();
		System.out.println("Enter" + size + "element");
		int arr[] = new int[size];

		for (int i = 0; i < size; i++)
			
		{
			arr[i] = sc.nextInt();
		}
		SwapArray s = new SwapArray();
		s.swap(arr, size);

	}
}
