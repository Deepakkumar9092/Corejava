package oopsbyashokIt;

public class Employee extends Inheritance {
	double salary;
	public Employee() {//default constructor calling
		System.out.println("Child class :: Constructor called");
	}
	public Employee(int id ,String name,double salary) { //parameterized constructor calling
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	void Derived() {
		System.out.println("This is Derived class of Inheritance Base class");
	}
	public static void main(String[] args) {
		Employee em = new Employee();
		Employee e = new Employee(12,"Deepak",2343324.3244);
		System.out.println(e.id+" "+e.name+" "+ e.salary);
		em.id=32;
		em.name="Deepak";
		 System.out.println(em.id+" "+ em.name );
		em.Base();//Calling the Base class method(Inheritance is a name of base class)
		em.Derived();// calling the child class (Employee child class methods
	}
	 
}