package OopsConcept.java;
//better control of Instance variable like instance variable is private
public class OOpsConcept {
		//Instance variable already be private
		private int rollNo;
		private String name;
		private byte age;
		
		//Instance Methods
		//setter and getter must be public for roll no
		public void setRollNo(int rollNo) {
			if(rollNo>0)
			this.rollNo=rollNo;
		}
		public void setName(String name){
			this.name=name;
			}
		public void setAge(byte age) {
			this.age=age;
		}
		//for getter
		public int getRollNo() {
			return rollNo;
		}
		public String getName() {
			return name;
		}
		public byte getAge() {
			return age;
		}
		
		//To string method is used to print Exact name baised
		@Override
		public String toString() {
			return "Roll No " + rollNo +" Name: "+name + " age " +age;
		}
}
