package com.ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionApiLearn {
		
	/*======Reflection Api=============
	 * Reflection Api - Using Reflection Api we can analyze our java classes.
	 * Reflection Api is used to analyze the software 
	 
	 	*  Reflection means ability of a software to analyze itself. In Java, Reflection API provides facility to analyse and change runtime behaviour of a class at runtime.
		-> For example, using reflection at the runtime you can determine what method, field,constructor or modifiers a class supports.
		-> The java.lang.Class class provides methods that are used to get metadata and manipulate the run time behaviour of a class.
		-> The java.lang and java.lang.reflect packages provide many classes for reflection and get metadata of a particular class.
		-> One of the advantages of reflection API is, we can manipulate private members of the class too.
		
		* Uses of Reflection
			• Developing IDE
			• Debugging and Test tools
			• Loading drivers and providing dynamic information
		
		* Disadvantages of Reflection
			• Low performance
			• Security risk
			• Violation of Oops concept
		
		
	 Example-
	 		Employee
	 		
	 	What variables available ?
	 	What methods available ?
	 	what constructor available ?
	 	
	Q. Difference between ClassNotFoundException and NoClassDefFoundError ?
	 Ans - If we give wrong class name in Class,forName("") then we will get ClassNotFoundException.
	 	 - NoClassDefFoundError will occur if jvm not able to find.class file of particular class to load. 
	 * */
	
	public static void main(String[] args) throws Exception {
		// This is for 
		Class<?> c = Class.forName("com.ReflectionApi.Student");// TO load the class into jvm
			Method method = c.getDeclaredMethod("display");
			Object obj = c.newInstance();// Object creation of loaded class
			method.invoke(obj, null);// To invoke the method of another class method in this class main method
			
		/* =======================================================================
		 
		//To access private value of another class using Reflection API
		 
		 Class cl = Class.forName("com.ReflectionApi.Student");// Loading the class into jvm
		Method method = cl.getDeclaredMethod("display");//This is for private variable of another class accessiable
			
		
		Object obj = cl.newInstance();// Create a object for the loaded class
		Field field = cl.getDeclaredField("age");// getting the field whose name is age
		field.setAccessible(true);//Making private variable accessible also outside of the class
		field.set(obj, 23);// Setting the value of variable using set method
		
		Student s =(Student)obj;//TypeCasting of the object
	    s.display();
		
		
	//      ======================*****************================================================
		// This is a approach to check there variable and methods and constructors of another class.
		/* Class cls = Class.forName("com.ReflectionApi.Student");//First we need to load the jvm then you need to go Class.forName("Packagename.className");
		
		Field[] field = cls.getDeclaredFields(); // THis method is going to return field array 
		for(Field f : field) {
			System.out.println(f.getName());// I am getting the field of another class using Reflection APi
			// Here I am getting variable name
		}
		
		Method[] declaredMethods = cls.getDeclaredMethods();// For get the methods of another class then you call for cls.getdeclaredmethods()
		for(Method d: declaredMethods) {
			System.out.println(d.getName());
			//Here i am getting methods name.
		}
		
		Constructor[] declaredConstructors = cls.getDeclaredConstructors(); // FOr get the constructor of another class then you call for cls.getdeclaredconstructors() method. 
		for(Constructor c : declaredConstructors) {
			System.out.println(c.getName());
		}
		*/
	}
}
