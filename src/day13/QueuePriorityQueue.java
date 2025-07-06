package day13;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriorityQueue {
	
	public static void main(String[] args) {
		queueLinked();
	}
	
	private static void queueLinked() {
		
		//It will return in the sorting order compare to Linkedlist queue

		Queue<Integer> q = new PriorityQueue<Integer>();
		
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
		
//		q.clear();
		
		System.out.println(q.remove());
		System.out.println(q);
		
		System.out.println("**************************");
		
		Queue<Integer> qq = new PriorityQueue<Integer>();
		
		qq.add(50);
		qq.add(150);
		qq.add(550);
		qq.add(30);
		qq.add(80);
		qq.add(5);
		
		System.out.println(qq);
		
		while(!qq.isEmpty()) {
			System.out.println(qq.poll());
		}
	}

}
