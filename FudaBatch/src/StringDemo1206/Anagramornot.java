package StringDemo1206;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Apple";
		String s2 = "ppAle";
		char ch1[] = s1.toCharArray(); //convert string to char array
		char ch2[] = s2.toCharArray();

		for (int i = 0; i < ch1.length; i++)
		{
			for (int j = i + 1; j < ch1.length; j++) 
			{
				if (ch1[i] > ch1[j])  // compare char
				{
					char temp = ch1[i];
					ch1[i] = ch1[j];
					ch1[j] = temp;
				}
			}
			System.out.print(ch1[i] + "");
		}
		System.out.println();

		for (int i = 0; i < ch2.length; i++) {
			for (int j = i + 1; j < ch2.length; j++) {
				if (ch2[i] > ch2[j]) {
					char temp = ch2[i];
					ch2[i] = ch2[j];
					ch2[j] = temp;
				}
			}
			System.out.print(ch2[i] + "");
		}
		System.out.println();

		int count = 0;
		if (ch1.length == ch2.length) {
			for (int i = 0; i < ch1.length; i++) {

				if (ch1[i] == ch2[i]) {
					count++;
				}
			}
			if (count == ch1.length) {
				System.out.println("Anagram String");
			} else {
				System.out.println("not Anagram String");
			}
		}

	}

}
