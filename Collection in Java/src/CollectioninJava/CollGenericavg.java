package CollectioninJava;

import java.util.ArrayList;

public class CollGenericavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>a1=new ArrayList<>();
		
		a1.add(60);
		a1.add(65);
		a1.add(70);
		a1.add(80);
		a1.add(75);
		
//		int total=a1;
//		double avg=(total/5.0);
//		

		System.out.println(a1);
		int sum=0;
		int count=0;
		for(int i=0;i<a1.size();i++)
		{
	sum=sum+a1.get(i);
		count++;
	 }
		double avg=sum/count;
		System.out.println("Average of marks:"+avg);
		
		
		}



	}


