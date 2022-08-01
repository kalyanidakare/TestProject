package CollectioninJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer>l1=new LinkedList<>();
		
		l1.add(10);
		l1.add(30);
		l1.add(40);
		l1.add(20);
		l1.add(50);
		l1.add(20);
		l1.add(40);
		l1.add(50);
		l1.add(40);
		
		Iterator<Integer> itr=l1.descendingIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
	}

}
