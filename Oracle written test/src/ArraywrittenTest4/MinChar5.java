package ArraywrittenTest4;

import java.util.Arrays;
import java.util.Scanner;

public class MinChar5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = sc.nextInt();//6
		System.out.println("Eter" + size + "elements:");
		char arr[] = new char[size];

		for (char i = 0; i < size; i++) {
			arr[i] = sc.next().charAt(0);
		}
		for (char i = 0; i < size; i++)// bubble sort
		{
			for (char j = 0; j < size - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
        System.out.println(Arrays.toString(arr));//arrays.tostring used to display array,eg[]a,b,c]
		System.out.println("minimum char:" + arr[0]);

	}

}
//arr[]=['A','D','E','X','Z','R']


