package com.Generic;

public class GenericsLearn<T>{   // you can use any Character like A-Z 
		/**
		 ===========Gerneric==============
		-  Generic introduce in java 1.5 version
		-  Generic are used to achieve type safety.
		-  Using generic we can write our classes/variables/methods independent of data type.
		
		syntax - 
				public void m1(Integer i){
				
				}
		 * */
		
		T obj;
	
	public void m1(T i) {// T represent generic type
		System.out.println("This is generic class use for any type of data type you can use easily = "+i);
	}
	public static void main(String[] args) {
		
		GenericsLearn g = new GenericsLearn();
		
		g.m1(23);// passing int value
		g.m1("Deepak");// passing string value
		g.m1(23.45); // passing double value
//		
//		g.obj= 23;
//		g.obj ="Deepak Kuamr";
//		g.obj = "Danger";
//		g.obj=324.435;
//		System.out.println();
		
	}
}
