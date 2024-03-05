package com.InnerOuter;

public class OuterInner {
	/* Inner Class -> Creating one class inside a class is called as Inner class.
	Inner class is also called as nested classes.
	The class which contains other class is called as Outer class
	
	syntax - 
			class A{
				
				class B{
				
				}
				}
		Here class A is a outer class
		Here class B is a inner class
		
	********Types of Inner Classes-----
			
		1. Non static inner class
			1.1 - Regular Inner class
			1.2 - Method local inner class
			1.3 - Anonymous inner class
			
		2. Static Inner class
	*/
	
	void Outerinner() {
		Inner i = new Inner();
		i.innermethod();
	}
	public static void main(String[] args) {
		OuterInner n = new OuterInner();
		n.Outerinner();
	}
	
	class Inner{
		void innermethod() {
			System.out.println("I am inner class created inside OuterInnerclass");
		}
	}
}
