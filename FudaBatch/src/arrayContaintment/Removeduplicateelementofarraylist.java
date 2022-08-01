package arrayContaintment;

import java.util.ArrayList;
import java.util.Scanner;

public class Removeduplicateelementofarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer>list=new ArrayList<>();
		
		
		a1.add(1);//0
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(1);
		a1.add(1);
		a1.add(1);
		a1.add(2);
		
//		System.out.println(a1);
//		Scanner sc=new Scanner(System.in);
//		System.out.println();
//		int s=sc.nextInt();
//		for(int i=0;i<a1.size();i++)
//		{
//		for(int j=i+1;j<a1.size();j++)
//		{
//			if(a1[i]==a1[j])
//		}
//		}
		for(Integer i:a1) {
			
		}
		
		 a1.removeAll(list);//remove common elemets also
	        System.out.println(a1);
	       
		
	}

}
