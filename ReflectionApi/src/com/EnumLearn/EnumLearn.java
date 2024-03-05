package com.EnumLearn;

import com.EnumCreation.Course;

public class EnumLearn {
	
	/*
	 ============Enums==============
	-  Enum is a special data type in java.
	-  Enum data type is used to create Constants
	-  To declear constant using Enum we will use 'enum' keyword
	-  Enum stands for Enumeration.
	 
	*  Enum is a data type which is used to declare fix set of constants.
	
	 * */
	enum WEEKDAYS{
		MONDAY, TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY;
		//When we want to declear pre-defined constants then we wil use enums concept.
	}
	enum WEEKENDS{
		SATURDAY,SUNDAY;
	}
	
	public static void main(String[] args) {
//		System.out.println(Course.springboot);// 1st way to print one value of enum
//		Course java = Course.springboot;//using create object and print value of enum
//		System.out.println(java);
		
		Course[] values = Course.values();// take a array and print all the values of enums
		for(Course c : values) {
			System.out.println(c);
		}
		
		
		
		
	}

	
	
	/**
	 ========Few points to Remember Related to Enums==========
	 
	 1. Enum constants we can't override
	 2. Enum doesn't support object creation
	 3. Enum can't extends classes
	 4. Enum can be created in seperate file or we can create in existing class also
	 */
}
