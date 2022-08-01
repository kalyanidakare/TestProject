package CollectioninJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Removeduplicateelementofarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>a=new ArrayList<Integer>();
		
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
		ArrayList<Integer>all=new ArrayList<Integer>();

	
		for(int i=0;i<a.size();i++)
			{
			int cnt=0;
			for(int j=0;j<a.size();j++)
			{
				if(a.get(i)==a.get(i)&&j<i)
				{
					break;
				}
				else if(a.get(i)==a.get(j)&&j>=i) {
					cnt++;
				}
			}
			if(cnt!=0) 
			{
				all.add(a.get(i));
			}
			}
			System.out.println(all);
			
		for(Integer i:a) {
			if(all.contains(i))
			{
				all.add(i);
			}
			
		}System.out.println(all);
			}


	}


