package Setinjava;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer> qe=new PriorityQueue<>();

		//Queue<Integer> qe1=new PriorityQueue<>();
	qe.add(10);
	qe.add(20);
	qe.add(40);
	qe.add(50);
	qe.add(70);
	qe.add(80);
	qe.add(60);

	System.out.println(qe);
	qe.remove();//remove true or false
	System.out.println(qe);
	
	System.out.println("peek:"+qe.peek());
	System.out.println(qe.element());//head but it will throw exception when queue is empty
	
	System.out.println("poll:"+qe.poll());
	System.out.println(qe);
	
	System.out.println(qe.size());
	
	}

}
