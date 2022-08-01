package Day3;

import java.util.Scanner;

public class Vowelornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a char");
char ch=sc.next().charAt(0);
if(ch=='a' || ch=='e'||ch=='i'||ch=='0'||ch=='u')
{
	System.out.println("vowel");
}
else
{
	System.out.println("not vowel");
}
	}

}
