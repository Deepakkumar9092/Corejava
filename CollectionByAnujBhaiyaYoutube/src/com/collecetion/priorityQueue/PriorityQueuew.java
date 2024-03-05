package com.collecetion.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuew {
		
	public static void main(String[] args) {
			
		// PriorityQueue<Integer> pq = new PriorityQueue<>(); // For Min heap to print first value is minimum
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // for using Comaprator.reverseorder() is use for max heap
		 // Queue<Integer> p = new PriorityQueue<>(); // You can use both queue and priority queue. 
		pq.offer(23);
		pq.offer(45);
		pq.offer(12);
		pq.offer(78);
	
		System.out.println(pq); // It generate a min heap automatically so first print minimum value of queue
		
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
	}
}
