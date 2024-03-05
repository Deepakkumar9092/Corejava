package com.java.functionalinterfaces.features;

import java.util.function.Predicate;

public class FunctionalInterfaces {
		/*
		 
		 Functional Interface(@FunctionalInterface)
		 	a. predicate -> 
		 	
		 			// Method Without Lambda
	
	public boolean test(int i) {
		if(i > 10) {
			return true;
		}			// After this lambda expression this method is not required		else {
			return false;
		}
				
	}
	// You are writing predicate functional interface 
	public static void main(String[] args) {
		Predicate<Integer> p =i -> i > 10;  // This is lambda expression
		System.out.println(p.test(6));
		System.out.println(p.test(60));
	}
}
		 	
		 	b. Consumer ->
		 	 
		 	c. Supplier
		 	d. Function
		 	it provides in java.util.function package
		 	
		 	* Predicate -> It is predefined Functional interface 
		 	* It is used check condition and returns true or false value.
		 	* 
		 * */
	
	// Method Without Lambda
	
//	public boolean test(int i) {
//		if(i > 10) {
//			return true;
//		}			// After this lambda expression this method is not required
//		else {
//			return false;
//		}
//		
//		
//	}
	
	public static void main(String[] args) {
		String[] names = {"Ajay","Amar","Deepak", "Devil"};
		
		Predicate<String> p = name-> name.charAt(0) == 'A'|| name.charAt(0)=='D';//name.charAt(0)=='D'; This is optional
		for(String s : names) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}
	}
}
