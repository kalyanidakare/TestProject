package StringDemo1206;

import java.util.Scanner;

public class Stringremovedupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
//s="good bye bye my mom mom";
String s1[]=s.split(" ");
for(int i=0;i<s1.length;i++) 
{
	int c=0;
	for(int j=i+1;j<s1.length;j++)
	{
		if(s1[i].equals(s1[j]))
		{
			c++;
			s1[j]="0";
		}
	}
	if(c>0 && s1[i]!="0") {
		System.out.println(s1[i]+" ");
	}
}
	}

}
