package oopsbyashokIt;

 class Constructor {
	 
	 	 String name;
	 	double salary;
		private double sd;
	 	
	 	
//	 	Constructor(String n, double s){
	 	Constructor(){//1st constructor
	 		System.out.println("Null");
	 	}
	 		Constructor(String name,double salary){//2nd constructor
	 			this.name=name;
	 			this.salary=salary;
	 			System.out.println(this.name+this.salary);
	 		}
	 		Constructor(String name){//3rd constructor
	 			this.name=name;
	 			System.out.println(this.name);
	 		}
	 		Constructor(double sd){//4th constructor
	 			this.sd=sd;
	 			System.out.println(this.sd);
	 		}
	 		public static void main(String[] args) {
	 		//	Constructor cons = new Constructor(44,32);//add other example below
//	 			Constructor cons = new Constructor("Deepak",90000.500f);
//	 			Constructor cons1 = new Constructor("Naitik",80000.500f);
//	 			Constructor cons2 = new Constructor("Himanshu",150000.500f);
	 			//Add another example
	 		Constructor con= new Constructor();
	 		Constructor cons= new Constructor("Deepak",34324.343423);
			Constructor cons1 = new Constructor(32423.324);
			Constructor cons2= new Constructor("DeepakBhaiya");
	 		}
 }
	 		
	 		/*
	 		 * this keyword is a predefined keyword in java
	 		 * It is used to represent current class object
	 		 * this is used to Representing the current class instance variable 
	 		 * */
	 	

		
	
		/* Constructor-> It is a special type of method in java which is used to initialized current class instance variable.
		Constructor name should be same as Class name.
		Constructor will not have return type(not even void).
		
		Note: If we write return type for the constructor the it will become method.
		Note: During the object creation our class constructor will be executed.
		-- Object Creation Means calling the Constructor
		Constructor is mandatory to create the Object
		Note: If we can't write the constructor then java compiler adding one default constructor to our class
				-> javap classname
		Note: If we write constructor in java program JVM will not adding any constructor
		syntax: 
			Class Demo{
				Demo(){}// Constructor
				}
				
			Constructors will divided into two type
			   1. Default Constructor / Zero Parameterized Constructor
			   ---> Constructor without parameter
			   systax -
			   			class Student{
			   				Student()
									{} 
			   			}
			   2. Parameterized Constructor
			   --> Constructor which contains one or more parameter 
			   	  using parameter condition constructor
				 		Constructor(String name,double salary){
		 			System.out.println(name);
					 			System.out.println(salary);
				 		}
			   synstax- 
			   		class Student{
			   			Student(int age,String name){
			   			-----
			   			-----//Logics
			   			}
			   			
			   		}
		*/
//		
		
			
			
			/*=============Constructor Overloading============
			 * Writing more than one constructor with different parameter called as Constructor Overloading
			 * Writing two constructor with different parameter
			 * if we write two constructor with same parameter but you having different datatype
			 * syntax- ;
			 * class Employee{
			 * 		Employee(int id){
			 * 
			 * }
			 * Employee(String name){
			 * }
			 * }
			 * Eg-- 
			 * Constructor(String name,double salary){
	 			this.name=name;
	 			this.salary=salary;
	 			System.out.println(this.name+this.salary);
	 		}
	 		Constructor(String name){
	 			this.name=name;
	 			System.out.println(this.name);
	 		}
	 		public static void main(String[] args) {
	 		Constructor cons2= new Constructor("DeepakBhaiya");
	 		}
			 * */
			 

	
