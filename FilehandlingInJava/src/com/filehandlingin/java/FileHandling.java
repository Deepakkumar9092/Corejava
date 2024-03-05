package com.filehandlingin.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FileHandling {
		/*
		 ===========File Handling==============
		 Very important area in every programming language.
		 Common Operations follows in file handling -
		  	1. Create a file
		  	2. Write the data to file
		  	3. Read the data from file
		  	4. Delete the file
		  	
		  	To perform File operation java language provide on predefined class java.io.File
		  	java.io package contains set of classes and interfaces to perform input and output operations.
		  	
		  	 We can create a file by using file class
		  	 	syntax - File f = new File(String name);
		  	 	
		  	========== i/0 Streams===========
		  1.	ByteStream - audio, video , images(.png,.jpg),pdf , are in binary data
		  	   *    Types of ByteStream - 1.  Input Stream -> read binary data
		  						          2.  Output Stream -> write binary data
		  						          
		  2.	CharacterStream - you have any text file it contains CharacterStream
		  		*   Types of Character Stream - 1. Reader  -> read character data
		  								        2. Writer -> write character data
		 * */
	public static void main(String[] args) throws IOException {
		
		File f = new File("d.txt");
		
		boolean fi = f.createNewFile();
		System.out.println(fi);
		
		File f1 = new File("bc.txt");
		boolean s =f1.createNewFile();
		System.out.println(s);
		
		File d = new File("Deepak");
		boolean dirStatus = d.mkdir();// This is creating directory
		System.out.println(dirStatus);
		
		File cf = new File("data");// For create a directory
		boolean m = cf.mkdir();
		System.out.println(m);
		
		File af = new File(cf, "cd.txt");
		File af1 = new File(cf, "cd21.txt");// For creating a file in Directory
		boolean n= af.createNewFile();
		boolean n1= af1.createNewFile();
		System.out.println(n);
		
		File v = new File("data");
		String[] arr= v.list();//For checking how many file are created in Directory Folder.
		System.out.println(Arrays.toString(arr));
		
		//===========FileWriter============
		FileWriter fw = new FileWriter("dsf.txt");
		fw.write("Hi Good Morning");
		fw.write("\n");// For printing in new line 
		fw.write("How are you?");
		fw.flush();//Forcefully send the data to the file
		fw.close();//Remove the link between java program and file of the object
		
		//=========FileReader -> It is used to read the data===========
	/*	FileReader fr = new FileReader("dsf.txt");
		int i =fr.read();
		System.out.println("Ascii value of first character is- "+i);
		System.out.println((char)i);
		
		while(i!=-1) {//For Printing all character of your file
			System.out.print((char)i);//it is not recommended because it is a time consuming process.
			i = fr.read();
		}
		fr.close();
		
		*/
		
		// InputStreamReader isr = new InputStreamReader(System.in);No need in File //Connect java program from the keyboard
		FileReader fr = new FileReader("data.txt");//fr.readLine() is calling because it reads only one character at a time
		BufferedReader br = new BufferedReader(fr);// To read the group of data line by line.
		String line = br.readLine();// To read a group of character value to go readLine method.
		while(line!= null) {
			System.out.println(line);
			line = br.readLine();
		}
	}
}
