package StringDemo1206;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1 = "Java is a programming languages";
	String str[] = s1.split(" ");


		for (int i = 0; i < str.length; i++)
		{
			System.out.print(str[str.length-(i+1)]+" ");
		}
		System.out.println();
         char ch[]=s1.toCharArray();
			Scanner sc=new Scanner(System.in);
			char c=sc.next().charAt(0);
			int reverse=0;
			for (int i = 0; i<ch.length; i++) 
			{
				if(ch[i]==c)
				{
					reverse++;
				}
				}
					System.out.println("reverse string="+reverse);


			
		
	}

	}


