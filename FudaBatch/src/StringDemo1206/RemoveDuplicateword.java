package StringDemo1206;

import java.util.Scanner;

public class RemoveDuplicateword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");

		s=sc.nextLine();
//		System.out.println("Enter strings");
//		="java is a programming language java language";	
        String words[] = s.split(" ");
//		System.out.println("Duplicate words in string");

		for (int i = 0; i < words.length; i++)// given array
		{
			int count = 0;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}

			if (count >0)
				System.out.println(words[i]+" ");

		}


	}

}
