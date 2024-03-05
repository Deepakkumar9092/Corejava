package oopsbyashokIt;

import java.util.Arrays;

public class MethodsLogics {
//	Write a java method which will take 3 person object as input
	int age;
	String name;
	
	public static void main(String[] args) {
		MethodsLogics m1= new MethodsLogics();
		
		MethodsLogics p1= new MethodsLogics();
		p1.age=23;
		p1.name="Deepak";
		
		MethodsLogics p2 = new MethodsLogics();
		p2.age=43;
		p2.name="Nanital";
		
		MethodsLogics p3 = new MethodsLogics();
		p3.age=34;
		p3.name="danrks";
		
		m1.person(p1, p2,p3);
		
		
		
		
		int x[]= {32,43,54,23};
		for(int i:x) {
			System.out.print(i+" ");
		}
		System.out.println();
		int temp=0;
		for(int i=0;i<x.length/2;i++) {
			
			temp = x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i] = temp;
			
			
		}
		System.out.println(Arrays.toString(x));
	}
	static void person(MethodsLogics p1, MethodsLogics p2, MethodsLogics p3) { //Method area 
		System.out.println(p1.age +" "+ p1.name);
		System.out.println(p2.age +" "+ p2.name);
		System.out.println(p3.age +" "+ p3.name);
	}
	
}
	//Q1. Write a java method which will take 2 person object as input
/*	int age;
	String name;
	public static void main(String[] args) {
		MethodsLogics m1 = new MethodsLogics();
		
		MethodsLogics p1 =new  MethodsLogics();
		p1.age=32;
		p1.name=" Dinesh";
		
		MethodsLogics p2=new MethodsLogics();
		p2.age=32;
		p2.name="  Sajan";
		
		m1.n1(p1, p2);
		 
		}

	 void n1(MethodsLogics p1, MethodsLogics p2) {
		 
		System.out.println(p1.age+p1.name);
		System.out.println(p2.age+p2.name);
	}
	 
}*/

	//Write a java program to return University data based on University Id
	// 101--->id = 101, name = Oxford 
	//102--->id =102 , name= StandFord
	/* public static void main(String[] args) {
		MethodsLogics M1 = new MethodsLogics();
		University u = M1.u1(102);
		System.out.println(u.id+"-----"+ u.name);
		
		
		String str= M1.hello();	//This is for hello methods to call directly
		System.out.println(str);
	}
	static University u1(int id) {
		University u=new University();
		if(id==101) {
			u.id=101;
			u.name="Oxford";
		}
		else if(id==102) {
			u.id =102;
			u.name="Standford";
		}
		return u;
		
	}
	String hello() {
	String str="hello Deepak";
	return str;
	}
	
}
	class University {
		int id;
		String name;
	}*/ 

	//2nd Type to do write a methods 
		//Q1. Player data --> id,name, age
		//7-->Dhoni
		//18---> kohli
		//45---> Rohit Sharma
	/* public static void main(String[] args) {
		MethodsLogics ml2 = new MethodsLogics();
		Player p = ml2.m1(18, "Kohli");
		System.out.println("id="+ p.id +" name= "+ p.name +" age="+ p.age );
	}
	Player m1(int id,String name) {
		Player p= new Player();
		if(id==7) {
			p.id= 7;
			p.age=46;
			p.name="Dhoni";
		}
		else if(id==18) {
			p.id=18;
			p.name="Kohli";
			p.age=38;
		}
		else if(id==45) {
			p.id=45;
			p.name="Rohit Sharma";
			p.age=39;
		}
		return p;
	}
}
	
class Player{
	int id;
	String name;
	int age;
	}
	
	
	// Take Doctor class with doctorName, doctorAge, as properites
	//Create Driver class with print() method to print Doctor data

//	void print(Doctor d) {
//		System.out.println("Doctor Name: "+ d.Name);
//		System.out.println("Doctor Age:"+ d.age);
//	}
//	public static void main(String[] args) {
//		MethodsLogics m = new MethodsLogics();
//		Doctor d= new Doctor();		
//		m.print(d);
//	}
//	
//}
//class Doctor{
//	String Name="Deepak";
//		int age=31;
//	}
	*/ 
	/*  Q2. Take Product class with productId, productName,productPrice as properties
	Create Driver class with print()method to print product data
	
	public static void main(String[] args) {
		MethodsLogics m= new MethodsLogics();
		Product p = new Product();
		p.productId=435;
		p.productName="Apple Juice";
		p.productPrice=234.65;
		
		m.print(p);
	}
	void print(Product p) {
		System.out.println("product id:" +p.productId );
		System.out.println("product Name: "+p.productName);
		System.out.println("product Price: "+p.productPrice);
	}
}
class Product{
		int productId;
		String productName;
		double productPrice;
}
*/
	/*Q1.Take employee class with id and salary as properties
	//Take Driver class and write the method to print employee object data
	//call the print method from main method

	public static void main(String[] args) {
		MethodsLogics m1= new MethodsLogics();
		employee e = new employee();
		e.id=234;
		e.salary=393093;
		m1.print(e);
	}
	void print(employee e) {
		System.out.println("Id is :"+ e.id+" "+"salary is:"+ e.salary);
	}
}
	
	class employee{
		int id;
		double salary;
	}
	*/
//	public static void main(String[] args) {
//		int age=32;
//		MethodsLogics.checkage(0);
//		
//	}
//	static boolean checkage(int age) {
//		
//		return age>=18;
//	}
	//1. Scnerio
	//1. Write a java program to find max element in given array
//		static int max(int[] arr) {
//			//logic
//			// return;
//		}
	
/*	2.Write a java program to find the length of given name
 * 		//2nd scnerio
 * 		int lengthofgivenname(String name){
 *		  logic
 * 			return length;
 * 			}
 * 
 * 3. Write a java program sum of two number
 * 		int sum(int a,int b){
 * 			// logic
 * 			return a+b;
 * }
 * 
 * 	4.Write a java program to concat first and last name
 * 		int fullname(String fname,String lname){
 * 		//logic
 * 		
 * 		return fname+lname;
 * }
 * 
 * 	5. Write a java program to display person is eligible for vote or not
 * 
 * 			1st approach
 * 			void EligibleForVote(int age){
 * 					int age=19;
 * 					if(age>18)
 * 					s.o.p("Eligible for vote");
 * 					else
 * 					s.o.p("Not Eligible for vote);	
 * 					}
 * 
 * 			2nd approach
 * 			boolean checkage(int age){
 * 			return age>=18;
 * 	}
 * 
 * 		6. Write a java method to reverse array
 * 			int ReverseArray(int[] arr){
 * 				int temp=0; 
 * 				for(int i=0;i<arr.length()/2;i++){
 * 						temp=arr[i];
 * 						arr[i]=arr[arr.length-1-i];
 * 						arr[arr.length-1-i]=temp;
 * 				}
 * 					return arr;
 * */

