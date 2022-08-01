package CollectioninJava;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//normal for loop,advanced for loop,Iterator class,listIterator
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer>list=new ArrayList<>();//array list adding to another
		
		
		a1.add(10);//always index is start with 0
		a1.add(20);//1
		a1.add(30);//2
		a1.add(40);//3
		a1.add(50);//4
		a1.add(60);//5
		a1.add(10);
		a1.add(20);//6
		
		System.out.println(a1);
//		//Iterator
//		Iterator<Integer> itr=a1.iterator();//transverse in forward direction
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());//printn=ing the elements
//		}
//		
		//ListIterator
		ListIterator<Integer> litr=a1.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println();
		//Reverse direction
		litr=a1.listIterator(a1.size());//printing the list
		while(litr.hasPrevious()) {
			
		System.out.println(litr.previous()+" ");
		}
		
        a1.add(3, 100);		
		System.out.println(a1);
		
//		a1.remove(3); //index as input
//		System.out.println(a1);
//		
//		a1.clear();
//		System.out.println(a1);
//		
		System.out.println(a1.get(4));
		System.out.println(a1.isEmpty());
		System.out.println(a1.indexOf(10)+" "+a1.lastIndexOf(20));
		
		System.out.println(a1.contains(500));
		
		System.out.println(a1.set(2, 200));
        System.out.println(a1);
        
        list.add(1000);
        list.add(2000);
        list.add(3000);
        list.add(200);
		
        a1.addAll(list);//index,collection
        System.out.println(a1);
        
//        a1.removeAll(list);//remove common elemets also
//        System.out.println(a1);
      
        a1.retainAll(list);
        System.out.println(a1);
        System.out.println(a1.containsAll(list));
        
        ArrayList<Integer>list1=new ArrayList<>();
        
        list1.add(100);
        list1.add(2000);
        list1.add(3000);
        
        System.out.println(list.equals(list1));
        
//        a1.contains(a1.containsAll(list));
        
	}

}
