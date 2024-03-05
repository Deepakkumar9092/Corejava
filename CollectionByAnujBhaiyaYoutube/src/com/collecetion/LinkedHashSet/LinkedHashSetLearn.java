package com.collecetion.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetLearn {
		
	public static void main(String[] args) {
		Set<Integer> lhs = new LinkedHashSet<>();// it is used for order by functionality.
		
		lhs.add(43);
		lhs.add(41);
		lhs.add(76);
		lhs.add(13);
		lhs.add(231);
		
		System.out.println(lhs);
		
		lhs.remove(13);
		System.out.println(lhs);
		
		System.out.println(lhs.contains(76));
		
		System.out.println(lhs.isEmpty());
		
		System.out.println(lhs.size());
		
		// Time Complexity === O(N)
	}
}
