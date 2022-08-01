package Day4;

import java.util.Scanner;

public class SwitchVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter char");
char ch=sc.next().charAt(0);
//switch (expression) 
//{
//case 1:logic
//break;
//case 2:logic
//break;
//default;
//}
switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
	System.out.println("ITS VOWEL");
	break;
default:System.out.println("Its CONSONant");
}



}


}


	



	
	