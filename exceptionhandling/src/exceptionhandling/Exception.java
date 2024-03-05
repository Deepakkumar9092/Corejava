package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println("Hello"+" "+1/0);
			}
		
		catch(ArithmeticException e) {
			System.out.println("World");
		}
			
		

	}
	}
//		int age=20;
//		try {
//			Exception.checkAge(age);
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//		
	
//	
//	static void checkAge(int age) throws Throwable {
//		Exception c = new Exception();
//		
//		if(age>18){
//			System.out.println("Illegal for voting");
//		}
//		else {
//			throw new Throwable("Hello");
////			System.out.println("After throw statement");
//		}
//	}
	
		//Multiple catch are you used after try block
//public static void main(String[] args) {
//		try(Scanner scanner = new Scanner(System.in)){
//			System.out.println("Enter Integer value");
//			int intvariabl= scanner.nextInt();
//			
//			}catch(Exception ex) {
//				System.out.println(ex.getLocalizedMessage());
//			}
//		catch(InputMismatchException e) {
//			System.out.println(e.getMessage());
//		}
//		
		//=========== Handling exception==========
		// public static void main(String[] args) {
//		try(Scanner scanner = new Scanner(System.in)){
//			String number= scanner.nextLine();
//			
//		}catch(NumberFormatException numberFormatException) {
//			System.out.println(numberFormatException.getMessage());
//		}
		


//		//public static void main(String[] args) {
//		try {
//			try {
//			int num1=10;
//			int num2=0;
//			
//			System.out.println(num1/num2);
//			System.out.println("hello");
//			System.out.println("After divide exceptions");
//		
//		}catch(ArithmeticException e) {
//			
//			e.printStackTrace();
//		}
//			FileInputStream fileInput 
//			= new FileInputStream("E:/txt.txt");
//		}catch(FileNotFoundException e) {
//			e.fillInStackTrace();
//		}
		
		//=========== finally Block=============
//        public static void main(String[] args) {
//		try {
//			System.out.println(10/1);
//			System.exit(0);
//		}  finally {
//			// TODO: handle exception
//			System.out.println("Finally Block");
//			
//			
//			try {
//				
//			} 
//				catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
		//	catch(ArithmeticException e) {
//			
//		}
	// }

