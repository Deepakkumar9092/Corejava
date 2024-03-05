package oopsbyashokIt;

public class Student {
	int id;
	String name;
	int age;
	String gender;
	static String clg="Arya";
	public static void main(String[] args) {
		Student Deepak = new Student();
		Deepak.id = 102;
		Deepak.name ="Deepak";
		Deepak.gender="Male";
		Deepak.age = 22;
		System.out.println(Deepak.id+Deepak.name+Deepak.gender+Deepak.age+Deepak.clg);
		
		Student Nikita = new Student();
		Nikita.id=32;
		Nikita.name="Nikita";
		Nikita.gender="Female";
		Nikita.age=22;
		
		Student Himanshu = new Student();
		Himanshu.id=123;
		Himanshu.name = "Himanshu";
		Himanshu.gender="Male";
		Himanshu.age=23;
		
	}
}
