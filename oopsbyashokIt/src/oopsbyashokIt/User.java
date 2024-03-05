package oopsbyashokIt;

public class User extends Employee {
	int rank;
	public static void main(String[] args) {
		User us = new User();
		us.Derived();
		int rank= us.rank=23;
		int id = us.id=203;
		String name= us.name="Deepak";
//		System.out.println(us.name+" "+us.rank+" "+us.id);
		System.out.println(rank+" "+id+" "+name);
		us.Base();
		
	}
}
