package Inheritance.java;

public class InheritanceClass {
		String firstName;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		@Override
		public String toString() {
			return "InheritanceClass [firstName=" + firstName + ", getFirstName()=" + getFirstName() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
}
