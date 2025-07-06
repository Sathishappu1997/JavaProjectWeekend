package day13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
	
	public static void main(String[] args) {
		queueLinked();
	}
	
	private static void queueLinked() {

		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(10);
		q.add(40);
		q.add(30);
		q.add(70);
		q.add(20);
		
		System.out.println(q);
		
		q.add(100);
		System.out.println(q);
		
//		q.clear();
		
		System.out.println(q.element()); //throw exception
		System.out.println(q);
		
		System.out.println(q.isEmpty());
		
		q.offer(120);
		System.out.println(q); //Same as add
		
//		q.clear();
		
		System.out.println(q.peek()); //Does not throw exception
		System.out.println(q);
		
//		q.clear();
		
		System.out.println(q.poll());
		System.out.println(q);
		
		q.clear();
		
		System.out.println(q.remove());
		System.out.println(q);
	}

}
