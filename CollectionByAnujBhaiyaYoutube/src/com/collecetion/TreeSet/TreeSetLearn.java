package com.collecetion.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLearn {
		
	public static void main(String[] args) {
		
		Set<Integer> ts = new TreeSet();// TreeSet is working as a Binary tree and define a set properties.
		// Specially used for shorted the set easily
		
		ts.add(32);
		ts.add(12);
		ts.add(1);// To add a element in TreeSet
		ts.add(54);
		ts.add(56);
		
		System.out.println(ts);
		
		ts.remove(12);// For delete the value from TreeSet.
		System.out.println(ts);
		
		System.out.println(ts.contains(54));// Check the value is available or not in TreeSet and return boolean value
		System.out.println(ts.isEmpty());// Checking for TreeSet is Empty or not its return boolean element
		System.out.println(ts.size());// Checking for TreeSet size 
		
		
		//======Time Complexity--> O(LogN)
	}
}
