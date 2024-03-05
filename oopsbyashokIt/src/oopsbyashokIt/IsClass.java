package oopsbyashokIt;

class User1{
	int id;
	String name;
	
	void speak() {
		System.out.println("Hi my id is "+id+" and my name is "+name);
	}
}
// If one class wants to re-use all the properties of another class then we will go for IS-A relations.
	// By using extends, Inheritance is a example

public class IsClass extends User1{
		public static void main(String[] args) {
			IsClass is = new IsClass();
			is.id=32;
			is.name="Deepak";
			is.speak();
		}
}
//This IS-A Class to use in Inheritance