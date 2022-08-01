package CollectioninJava;

import java.util.ArrayList;

public class CollectionGenericExample {

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
		
		System.out.println(a1);
//		for(int i=0;i<a1.size();i++)
//		{
//			System.out.println(a1.get(i));
//		}
		for(Integer i:a1)
		{
			System.out.println(i);
		}
	}

}
