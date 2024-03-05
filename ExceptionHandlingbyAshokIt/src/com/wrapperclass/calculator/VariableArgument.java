package com.wrapperclass.calculator;

import java.util.Scanner;

public class VariableArgument {
	/*=============Variable Argument============
	 * var-args concept introduced in java 1.5v
	 * When you don't know how many parameters to take for a method then use can use variable argument method
	 
	1. (...)-> ellipses(only 3 ellipses are allowed)
	2. variable argument should be the last argument of the method
	3. A method should contain only one variable argument
		
		syntax followed by variable argument-->
		
		public void m1(String s, int... r) --> valid
		public void m1(String s, boolean... b)--->valid
		public void m1(int i, String... s) ---> valid
		public void m1(int... i) ---> valid
		public void m1(int i,int j...) ---> invalid
		public void m1(int.... i) ---> invalid
		public void m1(int i, int... j)---> valid
		
		
	
		public void add(int... c) {
			int sum = 0;
			for(int x : c) {
				sum = sum+x;
			}
			System.out.println(sum);
		}
	
	
	*/
		public void add(int... c) {
			int sum = 0;
			for(int x : c) {
				sum = sum+x;
			}
			System.out.println(sum);
		}
	
//		int add(int a, int b) {
//			return a+b;
//		}
//		int add(int a,int b, int c) {
//			return a+b+c;
//		}
//		
//		int add(int a,int b, int c,int d) {
//			return a+b+c+d;
//		}
//		int add(int a,int b, int c,int d,int e) {
//			return a+b+c+d+e;
//		}
		
	public static void main(String[] args) {
		VariableArgument ca = new VariableArgument();
		ca.add(4);
		ca.add(32);
		ca.add(21,32);
		ca.add(23,43,54);
		ca.add(12,23,43,45);
		ca.add(132,23,43,45,65);
		ca.add(23,43,435,54,7,567,57);
	}
	
}
