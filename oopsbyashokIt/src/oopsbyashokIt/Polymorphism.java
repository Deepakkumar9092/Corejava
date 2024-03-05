package oopsbyashokIt;

public class Polymorphism extends subs{
/*	Exhibiting multiple behaviours based on situation is called as PolyMorphism
	 Eg - In below scnerio + symbol having 2 behaviour 
		10 + 20 = 30  (Here + is adding) 
	 "Deep" + "ak"  (Here + is concating behavior)
	
	Eg- When i come to class i will behave like a student
	 When I go to office i will behave like a engineer
	when i go to home i will behave like a family member
	
	=====Types of PolyMorphism========
	1. static PolyMorphism / Compile Time PolyMorphism
	======Types of Compile Time PolyMorphism====
			
			
			1. Function Overloading/Method Overloading 
			
			-- In Method Overloading scnerio Compiler will deceide which methods should be called 
			 eg-  add(34,43,23,34)Do not pass the extra parameter which is checking in Compile Time
			---We have given two methods with same function with parameter
			Eg- void add(int i,int j) {
				System.out.println(i+j); //fun name should be same
			}
				void add(int i,int j,int k) {   // fun name should be same
				System.out.println(i+j+k);
						}
						public static void main(String[] args) {
					Polymorphism p = new Polymorphism();
							p.add(23, 32);
					p.add(23, 324, 234);
		
								}
		Ex - Overloading--Use for code Read-abilty Constructor and methods also supports overloading
	=======Method Overriding==========
	The Process of writing same method in Parent class and Child class is called Method Overriding.
	Note: If you don't want to execute Parent class Method Implementation , then you can write our own implementation in child using Method Overriding
	
	2. dynamic PolyMorphism /Run Time PolyMorphism
	=========Types of Run Time PolyMorphism======
			1.Method Overriding--
			If polymorphism is decided at the time of execution time by JVM
then it is called as run time polymorphism.
Note: By using the concept of method overriding we can achieve this runtime poly
morphism.
		   eg- void add(int i,int j) {
		System.out.println(i+j);
	}
//	void add(int i,int j,int k) {
//		System.out.println(i+j+k);
//	}
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.add(23, 32);
//		p.add(23, 324, 234);
		
	}
	
}
class subs {
	void add(int i,int j) {
		System.out.println("this is dancer");
	}
		
	*/
	
	void add(int i,int j) {
		System.out.println(i+j);
	}
//	void add(int i,int j,int k) {
//		System.out.println(i+j+k);
//	}
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.add(23, 32);
//		p.add(23, 324, 234);
		
	}
	
}
class subs {
	void add(int i,int j) {
		System.out.println("this is dancer");
	}
}
