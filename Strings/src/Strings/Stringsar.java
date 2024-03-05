package Strings;

import java.util.*;

//import java.util.*;
//import java.lang.*;
public class Stringsar {
	// String is a pre-defined class available in java.lang package
	//String we can use as a data type also (Non-premitive/Referenced Data Type)
	//Note: Every java class is Referenced data type
	//String used to store groups of character
	//String is immutable (means can't be changed can't be update strings)
	//You want to change data in future you go with StringBuilder and StringBuffer(this is mutable)
	//StringBuffer is use for only one person access
	//StringBuffer is use for multiple person use then you can go with stringbuffer
	
	//----String class provided several methods to perform operations on string objects
	
	
	// Struing Constrant Pool	
		// It is special memory in JVM to store string object
		// It will not allow to store duplicate object
	
	public static void main(String... args) {
		
		// There are two approach to declare String 
		//1st Approach
//		String str="Deepak Kumar"; // (String Literal Approach)
//		System.out.println(str);
//		System.out.println(str.charAt(2));
//		System.out.println(str.length());
//		
//		String str2="Deepakbhaiya";
//		str.concat(str2);
//		System.out.println(str2);
//		
//		//2nd Approach
//		String str1 = new String("Hello");//using new Operator
//		System.out.println(str1);
		
		
		//==============================Some Important Predefine functions=============
		
		// #1) Length()
		//The length is the number of characters that a given string contains. String class has a
		// length() method that gives the number of characters in a String.
		
//		String str="Deepak";
//		System.out.print(str.length());
		
		//#2)concatenation
		//Although Java uses a ‘+’ operator for concatenating two or more strings. A concat() is an
		// inbuilt method for String concatenation in Java.
		
		/* 
		 String str="Deepak";
		String str1="Pandit";
		String str2=str.concat(str1);
		System.out.print(str2); 
		*/
		
		/* #3) String to CharArray()
	This method is used to convert all the characters of a string into a Character Array. This is
	widely used in the String manipulation programs.*/ 
		
		/* String str="Deepak";
		char[] charArray= str.toCharArray();
		System.out.println(charArray);
		*/
		
		// #4) String charAt()

		/* This method is used to retrieve a single character from a given String.
		The syntax is given as:
		char charAt(int i);
		The value of ‘i’ should not be negative and it should specify the location of a given String i.e.
		if a String length is 5, then the value of ‘i’ should be less than 5. */ 
		
//		String str="Deepak";
//		System.out.println(str.charAt(2));
		
	/*	#5) Java String compareTo()
	This method is used to compare two Strings. The comparison is based on alphabetical order.
	In general terms, a String is less than the other if it comes before the other in the dictionary.
	*/
//		String str1="Deepak";
//		String str2="Deepak";
//		int compare=str1.compareTo(str2);
//		System.out.print(compare);
		
		
		/* #6) String contains()
		This method is used to determine whether a substring is a part of the main String or not.
		The return type is Boolean.
		For E.g. In the below program, we will check whether “it” is a part of “ashokit” or not and
		we will also check whether “blog” is a part of “ashokit”.
		*/
		
//		String str="Deepak";
//		boolean constains1= str.contains("Deepak");
//		System.out.println(constains1);
//		
//		boolean constains2= str.contains("Bhaiya");
//		System.out.println(constains2);
		
//		#7) Java String split()
//	As the name suggests, a split() method is used to split or separate the given String into
//	multiple substrings separated by the delimiters (“”, “ ”, \\, etc).
//	In the below example, we will split the String (Thexyzwebsitexyzisxyzashokitxyzhelp) using a
//	chunk of String(xyz) already present in the main String.
		
//		String str="dsfkjahfaslkjfacasdaf";
//		String[] str1 = str.split("ca");
//		for(String st:str1)
//			System.out.println(st);
		
	/*	#8) Java String indexOf()
	This method is used to perform a search operation for a specific character or a substring on
	the main String. There is one more method known as lastIndexOf() which is also commonly
	used.*/
		
//		String str="sdnadf_andmsas-andkasf";
//		System.out.println(str.indexOf("a"));
//		System.out.println(str.indexOf("f"));
//		System.out.println(str.indexOf("4"));
		
		/* #9) Java String toString()
	This method returns the String equivalent of the object that invokes it. This method does
	not have any parameters. Given below is the program where we will try to get the String
	representation of the object.*/
		
//		String str="dedmnfad_sandflak";
//		System.out.println(str.toString());
		
	// 	#10) String replace ()
	// The replace() method is used to replace the character with the new characters in a String
		
//		String str="Hello world";
//		String replace=str.replace("java","deepak" );
//		System.out.println(replace);
		
		
//		int a=12;
//		int b=23;
//		System.out.println(valueOf(a)+valueOf(b));
		
		
//		int a=23;
//		int b=43;
//		String c = String.valueOf(a)+String.valueOf(b);
//		System.out.print(c);
		
//		String str= "Deepak";
//		String str1=str.intern();
//		System.out.print(str==str1);
//		System.out.println(str.startsWith("Dee"));
//		System.out.println(str.endsWith("ak"));
//		System.out.println(str.startsWith("e"));
//		
//		String str2=String.valueOf(str)+String.valueOf(str1);
//		System.out.println(str2);
		
		//toChar[]
			String str="Deepak";
			char[] arr=str.toCharArray();
			System.out.println(Arrays.toString(arr));// it convert string to array
			
	}
}
