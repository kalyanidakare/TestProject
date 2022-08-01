package LinkedList;

import java.util.LinkedList;

public class Comblinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>l1=new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
       System.out.println(l1);
       
		LinkedList<Integer>l2=new LinkedList<>();
		l2.add(11);
        l2.add(22);
        l2.add(33);
        l2.add(44);
        System.out.println(l2);
        
		LinkedList<Integer>l3=new LinkedList<>();
		for(int i=0;i<l1.size();i++)
		{
			l3.add(l1.get(i));
			if(i<l2.size())
			{
				l3.add(l2.get(i));
			}
		}

        System.out.println(l3);
	}

}
