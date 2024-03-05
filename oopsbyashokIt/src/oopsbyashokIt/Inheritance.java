package oopsbyashokIt;

public class Inheritance {
	
	/*
	 * The Process of  Extending the properties from one class to another class is called Inheritance
	 * To extend the properties we will use 'extend' keyword
	 * From which class we are extending the properties that the class called as 'Parent' or 'Super' or 'Base Class'.
	 * The class which is extending the properties is called 'Child, or 'Sub class' or 'Derived class'
	
	Example- child will inherit the properties from parent
	----------The main aim of Inheritance of Re-useability
	
	Note: In java, one child can't inherit properties from two parents at a time
	 * syntax:
	 * class User{
	 *properties
	 *methods
	 *}
	 *class Student extends User{
	 *	properties
	 *	methods
	 * 
	 * In above User class acting as a Parent class or sub class and Student class acting as a derived class
	 * By using Inheritance we can achieve code Re-useability
	 * 
	 * 
	 * =======+Types of Inheritance========
	 * 1. Single Inheritance
	 * 2. MultiLevel Inheritance
	 * 3. Hierarchical Inheritance
	 * 4. Multiple Inheritance---> Not supported by Java due to Ambiguity Problem
	 * 5. Hybrid Inheritance
	 * 
	 * Inheritance always priority will given child class. If child class doesn't contains that method then priority will be given to parent class methods.
	 * */
	
	 int id;
	 String name;
	 public Inheritance() {//Calling constructor
		System.out.println("Parent class :: Constructor called");
	}
	void Base() {
		System.out.println("This is Base class");
	}

}
