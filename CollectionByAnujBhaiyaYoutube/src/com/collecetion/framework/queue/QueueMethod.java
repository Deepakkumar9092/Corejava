package com.collecetion.framework.queue;
import java.util.*;
public class QueueMethod {
		public static void main(String[] args) {
			Queue<Integer> queue = new LinkedList();
			// Queue is interface and LinkedList is implement to queue in collection .
			queue.add(12);
			queue.add(34);
			queue.add(12);
			queue.add(34);
			queue.add(12);
			queue.add(34);
			queue.offer(43); //offer is used for adding a value in queue
			System.out.println(queue);
			queue.poll();//poll is used for remove the first value of queue
			System.out.println(queue);
			
			System.out.println(queue.peek()); // peek() calling means which value is remove next (Which element is in top to print and delete next value)
			
			queue.remove();// For remove the value of queue such as pool
			System.out.println(queue);
			
			System.out.println(queue.element());// Work as a peek() it works to show which is element in top.
			System.out.println(queue.peek());
		}
}
