package oopsbyashokIt;


 class Parent {
	void m1() {
		System.out.println("This is Parent class");
	}
	void m2() {
		System.out.println("This is also Parent class ");
	}
}

 class Testy extends Parent {
	public int hashcodee() {
		 return 101;
	 }
	 void m1() {
		System.out.println("This is Child class");
		super.m1();// Super class is used to access parent class property(method,variable, constructors also).
					// It is used to access direct parent class property.
	}
	 void m2() {
		 System.out.println("This is also  Child Class");
		 super.m2();
	 }
}
public class TestInheritance {
	public static void main(String[] args) {
		Testy t = new Testy();
		t.m1();
		t.m2();
		int hs= t.hashCode();
		System.out.println(hs);
	}
}