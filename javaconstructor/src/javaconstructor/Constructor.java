package javaconstructor;

public class Constructor {
	
public static void main(String... args) {
	constructorproperty();
}
		static int rollno ;
		static String name;
		static int age;
		//Parameterized Constructor
		public Constructor(int rollno,String name, int age ) {
			this.rollno=rollno;
			this.name=name;
			this.age=age;
			
		}		
	
		public static void constructorproperty() { 
	System.out.println("Roll No."+rollno + " name " + name + " age "+ age);
	
	}
		
	
}
