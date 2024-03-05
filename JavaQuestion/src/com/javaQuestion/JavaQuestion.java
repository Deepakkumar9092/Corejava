package com.javaQuestion;

public class JavaQuestion {
		
	/*Q1. 
	 * public static void main(String[] args) {
		int i = test();
		System.out.println(i);
	}
	static int test() {
		int i=10,j;
		return j= i++ + --i + ++i + ++i;
	}				// 10 + 10 + 11 + 12= 43 
	
	
		Q2.What is the output of the program
			
	static void test() {
		int m =100;
		System.out.println(m);
	}
	public static void main(String[] args) {
		JavaQuestion.test(); => 100
		
	} 
	// Q3 . What is the output 
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	static {
		System.out.println("This is a static");
	}
	void test(){
	System.out.println("this is test block");
	}
	
	Output -> This is a static
				Hello World

	Q4. What is the Output 
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		JavaQuestion.test();
	}
	static void test() {
		System.out.println("Hi i am test block");
	}
	output ->	 Hello World
			   	Hi i am test block
			 
			   	
	Q5. What is the Output		   	
			   
	{
		System.out.println("Good");
	}
	public static void main(String[] args) {
		JavaQuestion j = new JavaQuestion();
		System.out.println("Welcome");
	}
	static {
		System.out.println("This is static block");
	}
	Q6.	
	void test() {
		System.out.println("We are best friend");
	}
	public static void main(String[] args) {
		JavaQuestion j = new JavaQuestion();
		System.out.println("I am main method");
		j.test();
	}
	static {
		System.out.println("This is static function");//static block code
	}
	{
		System.out.println("Hlo Brother, how are you??");//Instance block code
	}
	
		static JavaQuestion test() {
		return new JavaQuestion();
	}
	public static void main(String[] args) {
		JavaQuestion j = new JavaQuestion();
		j.test1();
		JavaQuestion d = j.test();
		d.test1();
		
	}
	void test1() {
		System.out.println("Success");
	}
	*/ 
	int id;
	void m1(int a) {
		this.id=a;
	}
	void m1(int a, int b) {
		this.id=a;
		this.id=b;
	}
	public static void main(String[] args) {
		JavaQuestion j = new JavaQuestion();
		int d = j.id=32;
		System.out.println(d);
		j.id = 43;
		j.id=23;
	}
}	
