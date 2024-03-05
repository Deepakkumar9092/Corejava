package com.collecetion.framework.java;
import java.util.*;
public class ArraylistMethods {
	
	
	/* ===========ArrrayList=================
	 ArrayList is a Java class implemented using the List interface. Java ArrayList, as the name suggests, 
	 provides the functionality of a dynamic array where the size is not fixed as an array.
	  
	 */
//	public static void main(String[] args) throws Exception{
		
		/*
		 * String[] student  = new String[4];// Using for fix String size is 4.
			student[0]="Deepak";
			System.out.println(student[0]);
		*/
		
		// ======Using ArrayList start==========
		
	/*	List<Integer>Student= new ArrayList();
		Student.add(2);
		Student.add(3);
		Student.add(4);
		Student.add(5);
		System.out.println(Student);
		Student.add(0,50);// 4 is a index to change the value and 50 is a value to add in your arrayy
		System.out.println(Student);
		
		// Creating new ArrayList
		List<Integer>newlist = new ArrayList();
		newlist.add(324);
		newlist.add(234);
		
		Student.addAll(newlist); // For Append all the values
		System.out.println(Student);
		System.out.println(Student.get(3));// For get the value by checking get() method.
		
		
		ArrayList<String> StudentName = new ArrayList<String>();
		StudentName.add("Deepak Kumar");
		StudentName.add("Pandit Ji");
		System.out.println(StudentName);
		
		// For adding a upper string ArrayList class
		List<String> list1 = new ArrayList(); // For append two arraylist value into the last array.
		list1.add("Danger");
		list1.add("Khiladi");
		
		StudentName.addAll(list1);
		System.out.println(StudentName);
		
	
	*/
		// For Remove elements from your ArrayList
		public static void main(String[] args) throws Exception{
			List<Integer>list= new ArrayList();
			List<Integer>lis1t= new LinkedList();
			list.add(32);
			list.add(43);
			list.add(12);
			list.add(89);
			list.add(231);
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			list.add(50);
			
			
			System.out.println(list);
			list.remove(4);	// There will remove element from arraylist by using index
			System.out.println(list);// Time Complexity :- O(n)
			
			list.remove(Integer.valueOf(89)); // To remove element from arraylist by using value (datatype)
			System.out.println(list);
//			
//			list.clear();// To clear all the list value
//			System.out.println(list);
			
			list.set(3, 2121);// To Set/update the element in Arraylist // 3 is index and 2121 is a element to change/update the value
			System.out.println(list);
			
			System.out.println(list.contains(50));// It contains is present or not in Arraylist return true or false
			System.out.println(list.contains(978));
			
			// To Iterate the value using loop first approach to iterate
			for(int i=0;i<list.size();i++) {
				System.out.println("Size is "+list.get(i));
			}
			//Iterate the value using foreach loop 2nd approach to iterate
			System.out.println();
			for(Integer ele : list) {
				System.out.println("Size is "+ele);
			}
			
			// Using Iterator  3rd approach to iterate
			System.out.println();
			Iterator<Integer> it = list.iterator();
			while(it.hasNext()) {
				System.out.println("Third type of Iterator "+ it.next());
			}
		}
	
		
	}

