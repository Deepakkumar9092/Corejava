package LearnKeywordAndItsUses;

import java.lang.reflect.Method;

/*  ==============java.lang.Object class================
 	
*  Abstraction - Abstraction doesn't contains methods body 
*  static - It is the first priority to run code in JVM
*  void - If method don't want to return anything
*  return - If we want to return anything
*  break- If we come out from the loop 
*  continue - If we skip current iteration 
*  if - If we check the condition 
*  else - if condition is not satisfied then go else statement
*  switch - If we can check 5 and more condition then we will go for switch statement.
*  case - Inside the switch case is available
*  for - It is execute a loop based on the range(For is a range based loop)
*  while - It is execute a loop based on condition
*  do - First execute the statement then go for condition
*  byte 
*  short// There are 8 primitive data type available in Java
*  int
*  Long
*  float
*  double
*  boolean
*  char
*  

	=========Methods=============
	Q1. What is String toString Methods ? 
	Ans - It is use to represent Object in String format.
		- When we print any object or when we call toString() method by default it will call toString methods.
		
		public String toString() {
		this.getClass().getName()+"@"+Intger.toHexString(this.hashCode());
	}	// This is default hexadecimal format in the class
			Output of the class = @15db9742
			code-
			public class LearnKeyword {
	int id;
	String name;
	public static void main(String[] args) {
		
		LearnKeyword lk = new LearnKeyword();
		System.out.println(lk.toString());
		System.out.println(lk);
		}
		}
	
		another code
		int id;
	String name; 
	//Instance Variable 
	
	public String toString() {
		return id+" "+name;
	}
	public static void main(String[] args) {
		
		LearnKeyword lk = new LearnKeyword();
		System.out.println(lk);
		System.out.println(lk.toString().getClass().getName());
*/

/* 	==========boolean equals()======================
 	equals() method is used to compare one object to with another object and return boolean values.
 	Note: Object class equals() method will compare address of the object not content
 	
 		public class LearnKeyword {

	int id;
	String name;
	
	public LearnKeyword(int id,String name) {
			this.id=id;
			this.name=name;
	}
	
	public static void main(String[] args) {
		
		LearnKeyword lk = new LearnKeyword(101,"Deepak");// For object compare to another object so output is false
		LearnKeyword lk1 = new LearnKeyword(101,"Deepak");
		System.out.println(lk.equals(lk1));
		
		String s1 =new String("Deepak");// For creating a string and compare so output is true
		String s2= new String("Deepak");
		System.out.println(s1.equals(s2));
 		*/

/*
 	================getClass() and getName()================
 	
 	This method is used to get RunTime instance of class
 	
 	code-- 
 	
 	public static void main(String[] args) throws Exception {
	
		LearnKeyword lk = new LearnKeyword();//Object Creation
		Class ck = lk.getClass();// Get class information of lk object
		System.out.println(ck.getName());//Method chaining to get class name
		System.out.println(lk.getClass().getName());// This is all about method chaining
		
		Object obj = ck.newInstance();//Also Object Creations//This is another way to create class / This is second approach to create a class object in java.
		System.out.println(obj);// Two way to create a class object - by using new operator and by using class new instance method also you can create the object.
	
		Method[] methods = ck.getMethods();
		System.out.println(methods);
	}
 * */

/* 
 		========clone()==========
 		It is used to create duplicate object for the given object
 
 		The requirement to call cloning is to implements Cloneable in class file
 		Cloneable is a predefine code written in JVM
 		
 	*   First method to create object - By new Keyword
 	*   Second method to create object - Object obj = new.Instance; // by using class new instance method also you can create the object.
 	*   Third method to create object - By cloning (cloning is a xerox copy)
 
 	*    There are 3 way to create object in Java
 			1. using new operator
 			2. using newInstance Method
 			3. using clone method
 			
 		public static void main(String[] args) throws Exception  {
		LearnKeyword lk = new LearnKeyword();//1st way to create object
		System.out.println(lk);
		
		Class c= lk.getClass();// 
		Object newInstance = c.newInstance();// 2nd way of creating Objcet
		System.out.println(newInstance);
		
		Object obj = lk.clone();// 3rd way to create object for this class
		System.out.println(obj);
 * */

	/*
	 	==========finalize() Method===========
	 	When garbage collector removing any object form jvm then it will call finalize() method
	 	Garbage collector -> It is used to remove un-used objects / un-referenced objects from JVM heap area.
	 	
	
	 */

/*
 	=========super========
 	Super keyword is used to access parent class properties(variable, method, constructor)
 	It is used to access direct parent properties.
 	
 	code- 
 	
 	class parent{
	void name() {
		System.out.println("This is parent class");
	}
}
public class LearnKeyword extends parent{//without clonable jvm cannot understand that

	
	 void name() {
		 
		System.out.println("This is Deepak");
		super.name();
	}
	 
	public static void main(String[] args) throws Exception  {
		LearnKeyword lk = new LearnKeyword();
		lk.name();
		
	}
	
	this -> it is used to represent to current class
	
  */
class parent{
	void name() {
		System.out.println("This is parent class");
	}
	{
		System.out.println("Danger Deepak");
	}
	static {
		System.out.println("This is bhaiya");
	}
	
}
public class LearnKeyword extends parent{//without clonable jvm cannot understand that

	
	 void name() {
		 
		System.out.println("This is Deepak");
		super.name();
	}
	 
	public static void main(String[] args) throws Exception  {
		LearnKeyword lk = new LearnKeyword();
		lk.name();
		
	}
}

