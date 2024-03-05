package com.ibm;

import java.util.Scanner;

import com.oracle.Engine;

public class Car {
	public void drive() {
		Engine en  = new Engine();
		en.start();
		System.out.println("To Start Driving");
		
		Scanner s = new Scanner(System.in);
		s.next();
		System.out.println(s);
	}
	public static void main(String[] args) {
		Car ca = new Car();
		ca.drive();
	}
}
