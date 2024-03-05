package oopsbyashokIt;

public class BlocksInJava {
	/*
	 =========Blocks In Java=============
	 Block means some part or some piece of information or some piece of code.
	 
	 -- In Java program there are two type of Blocks
	 	1. Instance Block
	 	2. Static Block
	 	
	 	1. Instance Block -->If you want to execute some piece of code when object is created then we will go for instance block.
	 			syntax-
	 				 {
	 				// After created object they will be executed instance block
	 				}
	 		{
	 	-> Instance block will be executed before Constructor execution
	 	
				System.out.println("This is Instance Block");
				}
				static {
					System.out.println("This is static ");
				}
				public static void main(String[] args) {
	
					System.out.println("This is main method");
						BlocksInJava bij  = new BlocksInJava();
						}
		
	 	2. Static Block--> you are using static block directly without created any Objects using 'static' keyword.
	 	
	 	eg-
	 	static {
		System.out.println("This is static ");
	//  statements for calling before main method to called
	}
	 	
	 
	 */
	static int i=10;
	 void m1(){
		System.out.println("stjlksdj");
	}
	{
		System.out.println("This is Instance Block");
	}
	BlocksInJava(){// Constructor calling before instance block
		System.out.println("This is Constructor");
	}
	static {
		System.out.println(i);
		System.out.println("This is static ");
	
	}
	public static void main(String[] args) {
	
		System.out.println("This is main method");
		BlocksInJava bij  = new BlocksInJava();
		bij.m1();
		
	}
}
/** In Object class there 11 methods available in Java
 	1. Protected Object clone()
 	2. boolean equals(Object obj)
 	3. protected void Finalize()
 	4. class<?> getClass()
 	5. int hashCode()
 	6. String toString()
 	7. notify()
 	8. notifyAll()	// 5-10 methods are used for MultiThreading 
 	9. void wait()-> overloaded methods (without parameter/ with single parameter / with multiple parameter)
 	10. void wait(int i, int j)
 */


