package oopsbyashokIt;

public interface Interfaces {
	 /*
	  * Interface-- Used to achieve loosely coupling & Abstraction
		 * One java class is dependent on another java class is called Tightly coupling.
		 * Interfaces contains only Abstract Methods
		 * Once interface is created then body can provide implementation for the interface.
		 * We cannot create Object for the interfaces.
		 * Interface doesn't contains Constructor.
		 * To create a interface we will use 'interface' keyword.
		 * Implementing interface means overriding 'interface abstract method'.
		 * To implements a interface we will use 'implements' keyword.
		 * 
		 * One interface can't implement another interface
		 * One interface extend another interface
		 * In interface we can declare variable also , by default they are public static final
		 * 
		 * public interface Bank{
		 * 	
		 * }
		 * public interface HDFC implements Bank{// Invalid interface you can't call in one package
		 * }
		 * 
		 * public interface RBIBank extends Bank{
		 * This is valid in 
		 * }
		 * 
		 * 
		 * 
		 * =======Types of Interface ===========
		 
		 * 1. Marker Interface / Tagged Interface-->If interface doesn't contains any method then that interface is called Marker Interface.
		 * Eg-  Cloneable, Serialization etc.
		 * If your class implements pre-defined marker interface then JVM will treat our classes as special classes and it will provide special functionality.
		 	Eg- 
		 	// User Defined Marker-Interface--It doesn't contains any method is called User-defined Marker Interface
		 	public interface Demo{
		 		// No methods available in Interface
		 	}
		 	public class Test implements Demo{
		 	}
		  
		 * 2. Functional Interface--> In Interface which contains only one abstract method is called Functional Interface.
		 		Functional Interface are introduce to called 'Lambda Expression'.
		 		
		  	public abstract void moneyTransfer();
		 * 
	  */
	  
	 public abstract void moneyTransfer();
	  
	 public abstract void checkBalance();
	
}
