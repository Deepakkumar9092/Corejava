package oopsbyashokIt;
import java.util.*;
public class OopsConcepts {
	
	
	// public static void main(String[] args) {
		// ======hashCode()====
		/*jVM will assign unique hashCode for every object
		 * No two object has same hashcode
		 * We can get hashCode of object by calling java.lang.Object class hashCode()method
		 * u1.hashCode()
		 * Note:- java.lang.Object class is by default parent class for all java classes
		 *   eg- 
		 *   
		OopsConcepts u1 = new OopsConcepts();
		System.out.println(u1.hashCode());
		
		OopsConcepts u2 = new OopsConcepts();
		System.out.println(u2.hashCode());
		
		OopsConcepts u3= new OopsConcept();
		System.out.println(u3.hashCode());
		*/
		
		/* =============Variables==================
		 * Variables are used to store the data 
		 * There are 3 types of variables
		 * 1. Global variable / instance variable / non-statics variable = 
		 * Variables which are decleared inside the class and outside the methods are called as Instance variable.
		 * Instance variable can be accessed by all the methods available in the class
		 * Initialization is optional for instance variable
		 * Instance variable are called as Object variables
		 * When we create the object, memory will allocated for instance variables
		 * Instance variable/ global variable/ non-statics variable
		  local variable can't be access outside the function
		  
		 * int age; 
		
		public static void main(String[] args) {
			OopsConcepts raju = new OopsConcepts();
			raju.age=32;//Initialize the age of raju
			System.out.println(raju.age);
			
			OopsConcepts rani = new OopsConcepts();
			rani.age=34; // Initialization of rani age
			System.out.println(rani.age);
	}
		 * 2. static variable = The variable which are declared inside the class and outside the method with 'static' keyword are called as static varibale
		 * Static variable are class level variables
		 * When class is loaded into JVM then immediately memory will be allocated for static variable
		 * All Object of the class will maintain same copy of the static variable
		 * Memory will allocated for the static variables only once when the class is loaded into JVM
		 * Eg- 
		 *  	String name;
		String Email;
		static String Institute;
		
	    public static void main(String[] args) {
	    OopsConcepts.Institute = "Arya college";
		OopsConcepts Deepak = new OopsConcepts();
		Deepak.name="Deepak";
		Deepak.Email="dkejL@gmail.com";
		Deepak.Institute="Arya";
		System.out.println (Deepak.name +" " + Deepak.Email +" "+  Deepak.Institute);
		
		OopsConcepts naitik = new OopsConcepts();
		naitik.name="Naitik";
		naitik.Email="ndaikl@gmail.com";
		System.out.println(naitik.name + " "+ naitik.Email + " "+ naitik.Institute);
	}
		 * 3. local variable = 
		 * The variable which are declared inside the method / constructor / block are called local variable.  
		 * If we declare a variable with in the method, then that variable can used / accessed only with in that method.
		 * Before using local variable, we have initialze them
		 * eg- 
		 * public static void main(String[] args) {
		int a=0;// Local variable 
		int b=32;
		System.out.println(a);
		System.out.println(b);
	}
		 * */
	
	
//	private static OopsConcepts h1;
	/*===========Methods===========
	 * Methods are used to perform some operations
	 * return type <methodName> (par1,par2,par3,par4){
	 *logic
	 *return value 
	 *}
	 *
	 * Method return type is mandatory(if you don't return anything then you should use 'void'
	 * Method name is mandatory
	 * Method parameter are optional
	 * When method is having return type then it has to return that value
	 * return statement should be the last line of method
	 * 
	 *  int add(int a, int b) {
		int c=a+b;
		return c;
	}
	void hello() {
		System.out.print("dklsjl");
	}
	*
	* ===Types of Methods======
	* 1. Instance Methods --> Object level methods
	*  Instance methods will called by using Object
	*  
	* 2. static methods ---->Class level methods
	*  Static methods will be called by using class
	* 
	* When we write methods in java class, by default jvm will not execute them
	* To execute our methods we have to call them in main method
	* Note: JVM will start our program execution from main method. Main method is called as entry point for jvm execution
	* Code- 
	*  public static void main(String[] args) {
		System.out.println("Hlo i am deepak");
		
		OopsConcepts s1= new OopsConcepts();// Instance method will be created by using Object
		s1.hello();
		
		OopsConcepts.hii();// For static you will use class name and static methods name
		
	}
	void hello() { //Use to make a class of object are created then called functions name
		System.out.println("deepak here");
	}
	static void hii() {
		System.out.println("Good Morning...");
	}
	
	* another code- 
	* The is big error by default because of you make a method int type then you call only integer variables
	 int add(int a,int b) {
		String str="deepak";
		return a+b;
		//return str;
		 * 
		 * 
		 * another code-
		 * //	 boolean m2(int a, int b) {
//		 if(a>b) {
//			 return true;
//		 }
//		 else {
//			 return false;
//		 }
//	 }
	
	//Optimized code of same as upper code of boolean
//	static boolean m3(int a, int b) {
//		 return a>b;
//	 }
	}
	* */
	public static void main(String[] args) {
//		System.out.println("Hlo Bhai kya hal hai");
//        OopsConcepts.fullname("Deepak", " Kuamr");//this is for full name methods for static method
////		OopsConcepts we=new OopsConcepts();
////		we.fullname("sd", "sd");
//		OopsConcepts ew= new OopsConcepts(); // this is for print methods for instance method
//		int ar[]= {34,23,43};
//		ew.print(ar);
//		
//	}
//	static void fullname(String fname, String lname) {
//		String name= fname+lname;
//		System.out.println(name);
//	}
//	void print(int[] arr) {
//		System.out.println(Arrays.toString(arr));
		//or
//		for(int i: arr)
//			System.out.print(i+" ");
		
		//=======Methods are you follow================
		
	/*	1)Method with parameter and with return type
	 * 	
	 * 	int deep(int a,int b){
	 * 		return a+b;
	 * }
	 * 
	 *  2) Method with parameter and without return type
	 *  	void deep(int a,int b){
	 *  		s.o.p(a+b);
	 *  }
	 *  3) Method  with return type and without parameter  
	 *  	int m1(){
	 *  	int a=32;
	 *  	int b=23;
	 *  return a+b;
	 *  }
	 *  4) Method without return type and without parameter 
	 * 			void m2(){
	 * 		s.o.p("dfs")
	 * }
	 * */
	}

}
		

