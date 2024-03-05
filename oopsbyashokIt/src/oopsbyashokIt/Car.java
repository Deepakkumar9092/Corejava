package oopsbyashokIt;

public class Car {

	void carstart() {
		Engine en = new Engine();
		en.Start(23);;
		
		System.out.println("Car is Ready for Journey");
	}
	
	public static void main(String[] args) {
		Car ca = new Car();
		ca.carstart();
	}
}
//  This is Has-A Relation use for Composition