package com.collecetion.CollectionClassLearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassLearn {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList();
		l.add(32);
		l.add(12);
		l.add(54);
		l.add(54);
		l.add(21);
		l.add(56);
		l.add(1);
		l.add(99);

		System.out.println("Min Element - "+ Collections.min(l)); // COllections.min is used to find minimum value of the list
		System.out.println("Max Element- " + Collections.max(l));
		System.out.println("Frequency- "+ Collections.frequency(l, 54));// Frequency check your value of the list is coming how many time 
		
		Collections.sort(l); 
		System.out.println("To print the sort in Ascending order "+l);
		Collections.sort(l, Comparator.reverseOrder());
		System.out.println("TO print the sort in Descending order "+l);
	}
}
