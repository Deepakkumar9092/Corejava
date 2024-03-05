package com.wrapperclass;

public class WrapperClass {
		/*=========Wrapper Classes=================
		 -> In java we can represent everything in the form of Object.
		 -> To represent primitive type in object format java provide Wrapper Classes.
		 -> For every primitive type Corresponding Wrapper class is available.
		 -> All Wrapper classes are part of  java.lang.package.
		 
		 ==================
		 Primitive	  Wrapper Class
		 
		 byte     ->   Byte -> Eg - 	byte a=10;//-> a is a variable of byte type
					System.out.println(a);
					
				****	Auto-Boxing -> The processing of Converting primitive type to Wrapper Object
						Byte b = new Byte(a); //boxing type -> b is a variable Byte Class type Object is a wrapper Object
					System.out.println(b);
					
		    *****  Auto-Un-boxing->The Process of Converting Wrapper Object into primitive type
					byte b2 = b;
					System.out.println(b2);
					, 
		 short    ->   Short ->
		 					short s = 32;//Primitive type
							System.out.println(s);
	
							Short s1 = new Short(s);//Wrapper Object
							System.out.println(s1);
										,
		 int      ->    Integer ->
		 							int i=10;
									System.out.println(i);
	
									Integer i1 = new Integer(i);
									System.out.println(i1);
									,
		 long     ->    Long ->
								long l = 243242334;
								System.out.println(l);
								Long l1=new Long(l);
								System.out.println(l1);
								,
	     double   ->    Double -> 
	     				double d = 4342223.324343;
						System.out.println(d);
						Double d2 = new Double(d);
						System.out.println(d2);
						,
		 float    ->   Float -> 
		 				float f =23.323f;
						System.out.println(f);
						Float f1 = new Float(f);
						System.out.println(f1);
						,
		 boolean  ->    Boolean -> 
		 					boolean b = true;
							System.out.println(b);
							Boolean b2 = new Boolean(b);
							System.out.println(b2);
							,
		  char    ->    Character ->
		  					char c ='d';
							System.out.println(c);
							Character c2 = new Character(c);
							System.out.println(c2);
							
				-> Character class don't having using Wrapper Class
				Character c = new Character("a");--> Invaid
				Character d = new Character('a');
				System.out.println(c+d);
		
		 Auto-Boxing -> The processing of Converting primitive type to Wrapper Object.
		 Auto-Un-boxing -> The Process of Converting Wrapper Object into primitive type
		 * */
	public static void main(String[] args) {
		Integer i = new Integer(23);
		Integer j = new Integer("22");
		Integer k = i+j;
		System.out.println(k);
		
		
		byte s =127;//auto boxing
		Byte s1 = new Byte(s);//auto unboxing
		System.out.println(s1);
		
		
	}
}
