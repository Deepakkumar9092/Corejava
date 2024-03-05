package com.java.newfeatures18v.lambadexpression;


@FunctionalInterface
interface parent {
	public void m1();
}

public class LambadaLearn implements parent{

	@Override
	public void m1() {
		System.out.println("This is Interface method you are using");
		
	}
	public static void main(String[] args) {
		LambadaLearn l = new LambadaLearn();
		l.m1();
	}
	
	/*
	 =========Lambad Expression ==========
	 	-> Introduced in java 1.8v.
	 	-> Java is a Object Oriented Programming language. Everything will be represented using Classes and Objects.
	 	-> In OOps language Classes and Objects are main entities.We need to write a method inside the class only.
	 	
	 	-> From using 1.8 version onWards java is also called Functional Programming language also.
	 	-> In a Functional programming language means everything in the form of Functions. Functions can exits inside of the class and also outside of the class.
	 	-> Functions can be stored in a Referenced Variables.A function can be passed as a parameter to other methods.
	 	-> Lambda Expression introduced in Java to enable Functional Programming.
	 	
	 	 Q1. What is Lambda ?
	 	 Ans- Lambda is an Anonymous function means without name,without modifier, No Return Type
	 	 	- No Name
	 	 	- No Modifier
	 	 	- No Return Type
	 	
	 	syntax -  Normal Method						Lambda Expression
	 			public void m2(){		->->->       () -> { } // -> Represent body of the lambda
	 			s.o.p("hi);				->->->		() -> {s.o.p("hi")};// This part is called as body part of Lambda
	 			}						
	 	 	
	 	 		void m1(int i,intj){		-->     (int i,int j) -> {s.o.p(i+j)}; // This is our lamb
	 	 		s.o.p(i+j);					-->     (i,j)->s.o.p(i+j); // you can take without taking data type it directly concatenation
	 	 		} 
	 	
	 	
	 		int getLength(String name){		--> (String name) -> {return name.length()};   or,
	 		return name.length();			-->    (name)-> return name.length();
	 		 }								-->    name -> return name.length();
	 		 								--->   name -> name.lenght();
	 		 								
	 public Double getEmpSalary(Employee emp){  -> (Employee emp)->{return emp.getsalary()};
	 											-> (emp)->return emp.getsalary();
	 return emp.getsalary();					-> emp -> emp.getsalary();
	 		 }
	 		 
	 		 
	 		 ==========Functional Interface==========
	 		 The interface which contains only one Abstract method.
	 		 Functional interface invokes lambda expressions.
	 		 
	 		 		Runnable------> run() method
	 		 		Callable------> call() method
	 		 		Comparable----> compareTo() method
	 		 		
	 		 To represent one interface as functional interface we will use @FunctionalInterface
	 		 
	 		 @FunctionalInterface
	 		 interface parent{
	 		 public void m1();// We write only one method in functional interface
	 		 }
	 		 
	 		 @FunctionalInterface
	 		 interface child extends parent{
	 		 public void m3();
	 		 
	 		 }
	 * */
	
	
}




