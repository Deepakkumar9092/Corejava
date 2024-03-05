package com.wrapperclass;

import com.wrapperclassPeron.Person;//For normal Import
import static com.wrapperclassPeron.Person.*;//for easy import

/*static import-> static import is used to access static member directly without using class name
 
 * */
public class demo {
		public static void main(String[] args) {
			Person.speak();
			Person.m1();//Normal Import
			Person.m2();
			//To direct call import static keyword and package name.*;
		speak();
		m1();
		m2();
		
		}
}
