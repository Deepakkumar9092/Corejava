package com.collecetion.framework.Stack;

import java.util.Stack;

public class StackMethods {
		
	public static void main(String[] args) {
		Stack<Integer>stack = new Stack<>();
		stack.push(12);
		stack.push(435);
		stack.push(123);// To add a element in stack
		stack.push(89);
		
		System.out.println(stack);
		System.out.println(stack.peek()); // For checking which element in top of the stack
		
		stack.pop();
		System.out.println(stack.peek());
		
		Stack<String> s = new Stack<>();
		s.push("Dog");
		s.push("cat");
		s.push("horse");
		s.push("lion");
		s.push("tiger");
		
		System.out.println(s);
		System.out.println(s.peek());//peek() is used for checking which element is in top of the stack
		s.pop();// To Remove the top element of the stack
		System.out.println(s.peek());
	}
}
