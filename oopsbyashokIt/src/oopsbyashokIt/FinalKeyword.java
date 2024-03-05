package oopsbyashokIt;

public final class FinalKeyword { 
	/*============Final=============
	Final is a reserved keyword in java
	
	We can use this keyword in 3 places
		1. Class level
		2. Methods level
		3. Variable level
	
		You are using Final Keyword you can't be extend(Because it reacts as Immutable).
	* Final Classes can't be Inherited.
	* Final variable are nothing but Constant. Final variable can't be modified.
	* Final method cannot support Overriding
	*/
	int a=10;
	final void name() {
		int d= this.a=a;
		System.out.println("This is fix for all time " + d);
	}
	public static void main(String[] args) {
		FinalKeyword fk= new FinalKeyword();
		fk.name();
	}
}
