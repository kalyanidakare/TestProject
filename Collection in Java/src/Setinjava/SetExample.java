package Setinjava;

import java.util.HashSet;

public class SetExample {

	static void transeverseSet(HashSet<Integer>hs)
	{
		for(Integer i:hs)
		{
			System.out.println(i);
		}
	}
		static void avg(HashSet<Integer>hs)
		{
			int sum=0;
			for(Integer i:hs) 
			{
				sum=sum+i;
			}
			System.out.println("avg"+sum/hs.size());
		}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer>hs=new HashSet<Integer>();
		
		hs.add(10);
		hs.add(80);
		hs.add(60);
		hs.add(70);
		hs.add(85);
		hs.add(70);
		transeverseSet(hs);
		avg(hs);
		
		
	}


	}
	

