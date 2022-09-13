package queueCollectionsInJava;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		
		/*
		 * Queue is interface which implements collection
		 * queue is order by first in first out
		 * 
		 * in general we have two types of queue interface:
		 * 1) Queue=> is priorityQueue (class):
		 *  it is a one way queue you put in  at the end and 
		 * take out the value from the front of queue
		 * it has the method: add and pull
		 * 
		 * 2) Deque=> (ArrayDeque(class) , LinkedList (class):
		 * two way queue : we can add the value in the front or end of the queue
		 * and take out the value from front or end of queue
		 * it has the method: add and pull form the end or front
		 */

		/*
		 * priorityQueue and ArrayDeque is like Array
		 */
		
		// Queue
		
		Queue<String> q = new PriorityQueue <> ();
		
		PriorityQueue<String> pq = new PriorityQueue<String>();// it is one way queue
		
		q.add("value 1");
		q.add("value 2");
		q.add("value 3");
		q.add("value 4");
		
		System.out.println(q);
		System.out.println("peek: "+q.peek());// first in first out
		System.out.println("poll: "+q.poll());// get the first value out of the queue 
		System.out.println(q);
		
		System.out.println("------------------------------------");
		// Dequeue
		
		Deque<String> dq = new LinkedList<String> ();
		
		dq.add("1");
		dq.addFirst("2");
		dq.add("3");
		dq.add("4");
		dq.add("5");
		
		System.out.println(dq);
		System.out.println(dq.poll()); // it remove the first value
		System.out.println(dq);
		System.out.println(dq.pollLast()); // it removes the second value
		System.out.println(dq);
	}

}
