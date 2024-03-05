package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.cert.CertificateException;

public class ExceptionHandling {
	/**
	*  GraceFul/Successful Termination -> Termination after executing program successfully
	*  Abnormal Termination -> Termination in middle of program execution
	 
	 **********************************************
	 1. What is Exception ?
	 Ans-> Unexpected and Unwanted situation is called as Exception.
	 	-> Exception is disturb normal flow of program Execution
	 	-> When Exception occurred program will be terminated Abnormally.
	 	
	 	Note: As a programmer we are responsible for program graceful termination.
	 	-> To Achieve graceful termination we need to handle the exceptions occurred in program execution.
	 
	 *  Exception Handling -> The Process of handling exception is called exception handling. 
	 *  Aim Of Exception -> To achieve GraceFul/SuccessFul Termination of program execution.
	 
	 	In java we have so many predefined exceptions -
	 		ArithematicException
	 		NullPointerException
	 		FileNotFoundException
	 		SQLException
	 		
	 code-> 
	 System.out.println("Main() method started....");
		
		try {
			int i=10/0;	
			System.out.println(i);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("Welcome to java");
		
		System.out.println("Main() Method ended....");
	  
	 2. Why to handle Exception ?
	 3. Types of Exception.
	 			
	 			1. Exception-> you can handle and to achieve graceful termination 
	 							--	We can recover your program				
	 					There are two types of Exception -->
	 				
	 					1. Checked exception -> Will be identified at Compile time Exception
	 							Example- IOException, FileNotFoundException, SQLException etc..
	 									
	 					2. Unchecked exception -> RunTime or Null Pointer
	 						    Example - NullPointer, ArthematicException etc...
	 						    
	 						    NullPointer Exception -> If any data type has null value then in RunTime Exception is NullPointer.
	 						code-
	 						for NullPointer Exception
	 							String s=null;
								System.out.println(s.length());
								
								For ArithematicException
								try {
								int i=10/0;
									System.out.println(i);
										}catch(ArithmeticException a) {
												System.out.println("Solve Arithematic Exception");
													}
	 										
	 4. Exception vs Error
	 
	 Error -> you can't be handle programmatically
	 		code ->java.lang.StackOverflowError
	 	void m1() {
		m2();
	}
	void m2() {//java.lang.StackOverflowError
		m1();
	}
	public static void main(String[] args)  {
		try {
			ExceptionHandling eh = new ExceptionHandling();
			eh.m1();
		}
		catch(Throwable t) {
			t.printStackTrace();
		}
		
	}
	 
	 5. Exception Hierarchy -> In this hierarchy Throwable is the root class
	 							-> Throwable is a super/parent class of Exception and Error
	 							-> Throwable has two properties-
	 								1. Exception-> you can handle and to achieve graceful termination 
	 											--	We can recover your program
	 									a. checked exception -> Eg- IO or Compile time Exception
	 									b. unchecked exception ->Eg- RunTime or Null Pointer
	 									
	 								2.  Error-> you can't be handle and you can terminate Abnormal termination
	 								 		--	you can't recover your program
	 									a. Virtual Machine Error
	 									b. Assertion Error
	 6. Checked Exception
	 7. Un-checked Exception
	 8. Exception Handling Keyword
	 	 8.1 try -> try is used to keep Risky code
	 	 8.2 catch -> It is used to catch the exception when it is occurred in try block.
					-> To write a catch block try block is mandatory
	 	 8.3 finally -> It is used to perform resource clean up activity.
					 -> Finally block always be execute.
	 	 8.4 throw -> It is used to throw Exception programmatically.
						-> throw keyword is used to create the Exception.
	 	 8.5 throws -> It is used to hand over checked exceptions to caller method/jvm.
		
					-> throws keyword is used to ignore checked Exceptions(throws FileNotFoundException).
		8.6 
		* final -> It is a keyword used to declared final variable,final methods, final classes.
		* finalize() -> It is a predefined method available in Object class, and it will be called by garbage collector before removing object.
		* finally{} -> It is a block we will use to execute some clean activity in Exception handling.
								
	 9. Exception Propagation	
	 10. Try with Resources(java 1.7v feature)
	 11. User Defined Exception
	 
	 
	 
	====================== Exception Handling================
	There are 5 keyword to handle exceptions.
		1. try{} -> try is used to keep Risky code
				{
				//statements
				}
			
		2. catch() -> It is used to catch the exception when it is occurred in try block.
					-> To write a catch block try block is mandatory
					
		3. throw	-> It is used to throw Exception programmatically.
						-> throw keyword is used to create the Exception.
						synatx-
								throw new Exception("abc");
								
					public String getName(int id) throws Exception{
							if(id==100) {
						return "Deepak";
					}
					else if(id==101) {
					return "Kumar";
			
					}
				else {
//					throw new Exception("Name Not Found");
					throw new Exception("Enter valid id");
		}
	}
	public static void main(String[] args) throws Exception {
		ExceptionHandling eh = new ExceptionHandling();
		System.out.println(eh.getName(100)); //Output is Deepak
		
		String s=eh.getName(102);//Throw the Exceptions
	System.out.println(s);
	}
								
		4. throws -> It is used to hand over checked exceptions to caller method/jvm.
		
					-> throws keyword is used to ignore checked Exceptions(throws FileNotFoundException).
					
						Example- 
						public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fr = new FileReader("abc.txt");
		System.out.println(fr);
	}
					
			2nd eg- 
					public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		
		FileReader fr = new FileReader("abc.txt");
		Class.forName("");
		
		public static void main(String[] args) throws Exception { // It is ignore all checked exception
		
		FileReader fr = new FileReader("abc.txt");
		Class.forName("");
		
		
		5.finally -> It is used to perform resource clean up activity.
					-> Finally block always be execute.
					try --catch ---finally --> valid
					try--- finally ----valid
					catch--- finally---Invalid
					
		* final -> It is a keyword used to declared final variable,final methods, final classes.
		* finalize() -> It is a predefined method available in Object class, and it will be called by garbage collector before removing object.
		* finally{} -> It is a block we will use to execute some clean activity in Exception handling.
					
					code- 
					
					try {
			//Local variable -> Inside the method ,inside the variable, inside the block also and within the constructor
			System.out.println("This is starting try block");
			int i=10/0;
			// int i=10/2;
			System.out.println("this is ending try block");
			}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("This is the catch block");
		}finally {
			System.out.println("This is finally block");
		}
		System.out.println("Ending all blocks");
	}
		
		Note:	We can't write only try block you can use catch and either finally
			only try -----> Invalid in Java
			try - catch ----> valid combination
			try - finally ----> valid combination
			try - catch - finally ----> valid combination
			
			Follow the order
			you can write multiple catch block in try block
				code->
				
					
		System.out.println("Starting Exception is handling");
		try {
			System.out.println("try block is started from here");
			String s=null;
			System.out.println(s.length());
			
		}catch(ArithmeticException  e) { //1st write ArithmeticException
			System.out.println("in catch block");
			e.printStackTrace();
		}
		catch(NullPointerException e) { // 2nd write NullPointerException
			System.out.println("in catch block");
			e.printStackTrace();
		}
		catch(Exception e) {	//then 3rd in Exception
			System.out.println("in catch block");
			e.printStackTrace();
		}
		System.out.println("main method is ended");
	}
	-> Catch block follows child to parent order.
	 * @throws Exception 
	 * @throws ClassNotFoundException 
	 
	 
	 
	 ==========User Defined Exception ================
	 	Java provides rich set of built-in exception classes like:
	 	 ArithmeticException,
	 	  IOException,
		NullPointerException
		ClassNotFoundException
		SQLException
		ArrayNegativeSizeException
		ClassCastException  etc..
		
 		all are available in the java.lang package and used in exception
	handling. These exceptions are already set to trigger on pre-defined conditions such as
when you divide a number by zero it triggers ArithmeticException.
Apart from these classes, Java allows us to create our own exception class to provide own
exception implementation. These type of exceptions are called as user-defined exceptions
or custom exceptions.
-> To create the user defined exceptions, we have to follow the following procedure
procedure:

		1. All exception classes are extending from Exception class. So that to create user defined
exception we should create a class that extends any one of the following 2 classes

a) Exception (Checked Exceptions)
b) RuntimeException (Unchecked Exceptions)

2. Create a parameterized constructor which calls super class parameterized constructor to
set the Exception Message.

3. JVM don’t know when to generate the user defined exception and how to create and
throw the object for User defined exception so that we should explicitly create the object
for User defined exception and throw manually using throw keyword.


	
public class NoDataFound extends CertificateException{
	
	public NoDataFound() {
		
	}
	public NoDataFound(String msg) {
		super(msg);
	}
}

	String s(int id) throws Exception {
		if(id==100) {
			return "Deepak";
			
		}
		else if(id==101) {
			return "Kumar";
		}
		else {
			throw new NoDataFound("Invalid Id");
		}
	}
	public static void main(String[] args) throws Exception  {
		ExceptionHandling eh = new ExceptionHandling();
		System.out.println(eh.s(101));
		
	}
	 */
	
	String s(int id) throws Exception {
		if(id==100) {
			return "Deepak";
			
		}
		else if(id==101) {
			return "Kumar";
		}
		else {
			throw new NoDataFound("Invalid Id");
		}
	}
	public static void main(String[] args) throws Exception  {
		ExceptionHandling eh = new ExceptionHandling();
		System.out.println(eh.s(101));
		
		try {
			int a = 10/0;
		}catch(Exception e) {
			System.err.println("Danger Massage "+e);
		}
		
	}
}
