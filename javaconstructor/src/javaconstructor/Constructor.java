package javaconstructor;

public class Constructor {
	

		int rollno ;
		String name;
		int age;
		//Parameterized Constructor
		public Constructor(int rollno,String name, int age ) {
			this.rollno=rollno;
			this.name=name;
			this.age=age;
			
		}		
	
		public void constructorproperty() { 
	System.out.println("Roll No."+rollno + " name " + name + " age "+ age);
	
	}
		
	
}
