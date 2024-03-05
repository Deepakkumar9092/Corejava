package packagesbyashokitl48;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.*;
public class Packages {
	/*
	 * ====Packages -> Packages are used to group the classes and interfaces and Exception and Error.
	 *  Packages are nothing but collection of classes and interfaces
	 *  In java packages should be in first line
	In java there are many predefined in java
	Eg - String, StringBuffer, StringBuilder,Array, BufferReader, Scanner
	
	Sun people divided predefined classes and interfaces into several packages.
		eg - 1. java.lang -> String, StringBuffer, StringBuilder,Array, BufferReader, Scanner all are available in java.lang package
		 	 2. java.io -> Used for input/output classes / it will deal with file
		 	 3. java.util -> like Arrays class, scanner , ArrayList, Linked list, stack ,queue
		 	 4. java.sql -> It is used for DataBase functionality in sql.
		 	 
		 java.lang package is default package and it is available for all java classes by default.
		 If we want to use any predefined class which is not part of java.lang package then we have to import that package using 'import' keyword.
		 
		 package deepakit;
		 package com.arya.add;
		 package com.arya.sub;
		 
		 sample package name : company-name.project-name.module-name
		 
		 Example is ibm company--- 
		 
		package com.ibm.irctc.admin
		 	* AdminLogin.java  -> Available services in above package
		 	* AdminService.java
		 package com.ibm.user;
		 	* UserLogin.java
		 	* UserService.java
		 package com.ibm.irctc.report
		 	* ReportService.java
		 	* DailyReportService.java
		 
		 ========User Defined Packages=========
		 -> In our project we will create our own packages to organize project related classes and interfaces and Exception and Errors.
		 -> To create a package we will use 'package'keyword.
		 -> Class should have only one package statement
		 -> If two classes are in same packages then import not required
	*/ 
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter name");
		String name =  br.readLine();
//		int na = Integer.parseInt(name);
		System.out.println(name);
		System.out.println("Deepak Bhaiya");
	}
}	
