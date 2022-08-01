package StringDemo1206;

import java.util.Arrays;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 	

		String s="ka8l6y5a8n4i";
		char ch[]=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		int sum=0;
		for(int i=48;i<58;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(i==ch[j])
				{
					sum=sum+(i-48);
				}
			}
		}
		System.out.println(sum);
		
		
		
		
		
		
		
			

	}

}
