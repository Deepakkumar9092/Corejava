package utility.java;

import java.util.Scanner;

public class Utility {
	 
	int num1;
	int num2;
	
	Scanner scanner;
	
	//Default Constructor
	public Utility() {
		 scanner = new Scanner(System.in);
	}
	
	//Parameterized Constructor
	//variable shadowing
	public Utility(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		scanner=new Scanner(System.in);
		
	}
	public int printmenu() {
		System.out.println("1. For Addition");
		System.out.println("2. For Substraction");
		System.out.println("3. For Multiplication");
		System.out.println("4. For Divison");
		System.out.println("5. For Modulo");
		
		return scanner.nextInt();
		
		
	}
	//For Addition
	public void addition() {
		System.out.println(num1+num2);
		
	}
	//For Substraction
	public void substraction() {
		System.out.println(num1-num2);
		
	}
	//For Multiplication
	public void multiplication() {
		System.out.println(num1*num2);
		
	}
	//For Division
	public void divide() {
		System.out.println(num1/num2);
		
	}
	//For Modulo
	public void modulo() {
		System.out.println(num1%num2);
		
	}


	}
