package com.typecasting;

public class TypeCasting implements Cloneable {
	/*
	 TypeCasting -> Converting from one data to another data is called TypeCasting.
	 
	 Types of TypeCasting ->
	 	1. Widening / Up Casting -> The Process of converting lower data type to higher data type is called as Widening / UpCasting.
	 	-> As we are converting lower data types to higher data type there is no data loss.
	    -> For Widening / Up Casting no need to specify type cast operator explicitly.
	 		byte b=13;
			int i=b; // Widening / UpCasting
			System.out.println(i);
			
	 	2. Narrowing / Down Casting -> The Process of Converting higher data type to lower data type is called as Narrowing / Down Casting.
	 	->	As we are converting lower data type to higher data type there is a chance of data loss.
	 	->	For Narrowing / Down Casting we need to specify type cast operator explicitly.
	 		
	 		long l = 234;
			short s = (short)l;// Narrowing /DownCasting TypeCasting
			System.out.println(s);
			
			-> ParseInt(xx)is a static method available in Integer Wrapper class.
			
			
	 * */
	public static void main(String[] args) throws Exception{
		
/*		
 	
  		byte b=13;
		int i=b; // Widening / UpCasting
		System.out.println(i);
		
		long l = 234;
		short s = (short)l;// Narrowing /DownCasting TypeCasting
		System.out.println(s);
		int a = (int) l; // without typecasting its compile time error
		System.out.println(a);
		
		========String to int ==========
		String s2 = "34";
		int i =Integer.parseInt(s2);// COnvert string to integer by using Wrapper class
		System.out.println(i);
		
		String s1 = "230.32";
		double d = Double.parseDouble(s1); //Convert string to double by using Wrapper Class
		System.out.println(d);
		
		
		======= Converting int data to String data========
		int i=10;
		int j=21;
		String s1 = String.valueOf(i);// Convert int data to String data
		String s2 = String.valueOf(j);
		System.out.println(s1+s2);//1021
		
		*/
		
		TypeCasting t = new TypeCasting();
		Object object = t; // Widening / UpCasting TypesCasting
		
		
		Object obj = t.clone();
		TypeCasting t1 = (TypeCasting) obj; //Narrowing
						//    -> Typecasting means what is your class name
		
		
		
	}
}	
