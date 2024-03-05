package com.Generic;

public class example<T1,T2> {
	
	T1 obj1;
	T2 obj2;

	
	public example(T1 obj1, T2 obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void display() {
		System.out.println(obj1 + ","+  obj2);
	}

	public static void main(String[] args) {
		example<Integer,String> e = new example(23,"Deepak");
		e.display();
		
		example<String,Long> mobile = new example("Kumar", 906518129);
		mobile.display();
		
		
	}
}
