package CollectioninJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Collectiongenericoccurno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>a=new ArrayList<>();
		
		a.add(10);
		a.add(30);
		a.add(40);
		a.add(20);
		a.add(50);
		a.add(20);
		a.add(40);
		a.add(50);
		a.add(40);
		
		System.out.println(a);
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int s=sc.nextInt();
		
		for(int i=0;i<a.size();i++)
			{
		if (a.get(i)==s)
		{
			count++;
		}
			}
	
		System.out.println(count);
		sc.close();
	}

}
