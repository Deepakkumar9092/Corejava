package com.collecetion.TreeMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapLearn {
		
	public static void main(String[] args) {
		
		// TreeMap is used to send the value in Binary Search Tree
		Map<String, Integer> m = new TreeMap<>();
		m.put( "Deepak",1);
		m.put("Kumar",2);
		m.put("Vikram",3);
		m.put("Raj",4);
		m.put("binu", 9);
		
		System.out.println(m);
		
		// For iterate a Map for key and value
//		for(Entry<String, Integer>  e : m.entrySet()) {// It is Printing like one by one value
//			System.out.println(e);
//			
//			System.out.println(e.getKey());// For getting a key value
//			System.out.println(e.getValue());// FOr getting a element of key value
//		}
//		// Only for key printing to iterate
//		for(String key :m.keySet() ) {
//			System.out.println(key);
//		}
//		// Only Iterate for value
//		for(Integer value : m.values()) {
//			System.out.println(value);
//		}
//		
//		System.out.println(m.containsKey("Deepak"));
	}
}
