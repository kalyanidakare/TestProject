package CollectioninJava;

import java.util.ArrayList;
import java.util.ListIterator;

public class Collectionlinkedlistfailfast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>a1=new ArrayList<>();
		
		a1.add(10);
		a1.add(30);
		a1.add(40);
		a1.add(20);
		a1.add(50);
		a1.add(20);
		a1.add(40);
		a1.add(50);
		a1.add(40);
		
//		System.out.println(a1);
//		for(Integer i:a1)//fail fast iterator
//		{
//			if(i==20)
//				a1.remove(1);
//		}
		ListIterator<Integer> litr=a1.listIterator();//fail safe Iterators
		while(litr.hasNext())
		{
			if(litr.next()==20)//200 add after 20
				litr.add(200);//listIterator
		}

		System.out.println(a1);
	}

}
