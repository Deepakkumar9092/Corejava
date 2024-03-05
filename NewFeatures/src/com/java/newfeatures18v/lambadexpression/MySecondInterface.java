package com.java.newfeatures18v.lambadexpression;
//Initialize the lambda
@FunctionalInterface
interface Parents{
	public void m2();
}
public class MySecondInterface {
		// How to call that lambda
	public static void main(String[] args) {
		Parents p =	() -> System.out.println("This is m2 called using Lambda ");// Parents p is used for calling the lambda expression
		p.m2();// To call the m2 method.
	}
}
