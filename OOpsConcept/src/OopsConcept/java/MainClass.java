package OopsConcept.java;

public class MainClass {
	public static void main(String... args) {
		
		OOpsConcept student = new OOpsConcept();
		student.setRollNo(10);
		student.setName("Deepak");
		student.setAge((byte)22);
		//For printing the value
		System.out.println(student.getRollNo()+ " "+student.getName()+ " "+student.getAge());
		System.out.println(student.toString());
		
		//for another student to create new object
//		OOpsConcept student1 = new OOpsConcept();
//		student1.setRollNo(109);
//		student1.setName("Deepakjj");
//		student1.setAge((byte)20);
	//		System.out.println(student1.getRollNo()+ " "+student1.getName()+ " "+student1.getAge());
//		System.out.println(student1.toString());
//		int rollNo = student.rollNo;
//		String name =student.name;
//		byte age = student.age;
//		student.setRollNo(10);
	}
}
