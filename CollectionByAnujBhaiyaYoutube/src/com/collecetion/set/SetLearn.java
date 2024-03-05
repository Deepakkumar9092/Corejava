package com.collecetion.set;
import java.util.*;
public class SetLearn {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet();
		set.add(23);
		set.add(45);

		set.add(324);
		set.add(243);
		set.add(34);
		set.add(263);
		set.add(304);
		set.add(234);
		System.out.println(set);
		
		Set<Integer> set2 = new HashSet();
		set2.addAll(set);
		System.out.println(set2);
		
//		set2.clear();
//		System.out.println(set2);
		
		set2.remove(234);
		System.out.println(set2); // TO delete the element from set/hashset
		
		
		System.out.println(set2.contains(263));// contains means to check the value in set and value is here so return true otherwise return false.
		
		System.out.println(set2.isEmpty()); // isEmpty() return boolean value to check set is empty or not
		
		System.out.println(set2.size());
	}
}
