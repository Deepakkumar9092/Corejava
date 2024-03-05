package com.filehandlingin.morefilehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterInFileHandling {
	/*
	   ===========PrintWriter===================
	   	System.out.println("hi");
			System -> It is a class available in java.lang package
			
			Out -> It is a static variable available in System class
			    -> The data type of 'out' variable is PrintWriter class
			    
			 println() -> It is a method available in PrintWriter class.
	 * */
		public static void main(String[] args) throws FileNotFoundException {
			System.out.println("Deepak");
		//PrintWriter pw = new PrintWriter("ded.txt");
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Deepak");
		
		pw.write("I am Deepak Kumar from Jharkhand");
		pw.flush();// Forcefully send the data to the file
		pw.close();
		
 		}
		
}

/**
  			There are two type to print your value

		1. System.out.println("Deepak Kumar");-> 1st way to print the value in console
		2. PrintWriter pw =new PrintWriter(System.out);-> 2nd way to print the value in console
				pw.print("Deepak Kumar");
				pw.flush();
				pw.close();

*/