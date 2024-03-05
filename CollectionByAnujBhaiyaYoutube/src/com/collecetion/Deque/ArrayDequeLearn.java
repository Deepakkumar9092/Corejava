package com.collecetion.Deque;

import java.util.ArrayDeque;

public class ArrayDequeLearn {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.offer(32);
		ad.offer(332);
		ad.offer(322);
		
		ad.offerFirst(3);// TO add a element first of arraydeque
		ad.offerLast(23);// To add a element last of arraydeque
		System.out.println(ad);
	    ad.offer(938);
		System.out.println(ad);
		
		System.out.println(ad.peek());// For checking which is the 1st index show element in the top
		System.out.println(ad.peekFirst());// for checking first index 
		System.out.println(ad.peekLast());// Checking last index of arraydeque / show element in the last
		
		System.out.println(ad.poll());// For Removing element from ArrayDeque 
		System.out.println(ad);
	   System.out.println(ad.pollFirst());//Removing 1st element / Delete value
	   System.out.println(ad);
		System.out.println(ad.pollLast());//Removing last element
		System.out.println(ad);
		
	}

}
