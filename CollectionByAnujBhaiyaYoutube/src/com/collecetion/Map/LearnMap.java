package com.collecetion.Map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
		
		public static void main(String[] args) {
			Map<Integer,String> m = new HashMap(); // it is used for contains unique value
			
			m.put(1, "Deepak");
			m.put(2, "Kumar");
			m.put(3, "Vikram");
			m.put(4, "Raj");
			
			System.out.println(m);
			
			// For iterate a Map for key and value
			for(Map.Entry<Integer, String>  e : m.entrySet()) {// It is Printing like one by one value
				System.out.println(e);
				
				System.out.println(e.getKey());// For getting a key value
				System.out.println(e.getValue());// FOr getting a element of key value
			}
			// Only for key printing to iterate
			for(Integer key :m.keySet() ) {
				System.out.println(key);
			}
			// Only Iterate for value
			for(String value : m.values()) {
				System.out.println(value);
			}
			
			System.out.println(m.containsKey(2));// To check key 2 is available or not in HashMap
			
			m.putIfAbsent(2, "Ramu");
			System.out.println(m);
			
			
//			if(!m.containsKey(4)) {
//				m.put(4, "Raja");
//			}
//			System.out.println(m);
//			if(m.containsKey(4)) {// If you contains the duplicate key value to check the condition
//				m.put(4, "Raja");
//			}
//			System.out.println(m);
		}
		
}
