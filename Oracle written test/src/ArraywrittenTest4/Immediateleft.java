package ArraywrittenTest4;

import java.util.Arrays;
import java.util.Scanner;

public class Immediateleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Eter size of array::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter " + size + "no");

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			if (a[i] < 0) {
				a[i] = a[i - 1] * a[i - 1];
			}
			//
		}
		System.out.println(Arrays.toString(a));
	}
}
//12,3,-19,29,5,-61,44,7,-9  //9
//[12,3,-19,29,5,-61,44,7,49]
