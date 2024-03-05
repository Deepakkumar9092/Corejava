package oopsbyashokIt;

public class Test {
	
		public static void main(String[] args) {
			/*Encapsulation en = new Encapsulation();
			en.setAcc(334324534);
			en.setName("Deepak");
			
			long accno= en.getAcc();
			 String name= en.getName();
			 
			 System.out.println(accno+ " "+ name);
			 */
			
			
			//Take another project
			
			Encapsulation en= new Encapsulation();
			en.setId(12);
			en.setFname("Deepak");
			en.setLname("Kumar");
			en.setGender("Male");
			en.setPhoneNo(906518129);
			en.setCity("Jaipur");
			en.setState("Rajasthan");
			en.setCountry("India");
			
			int id = en.getId();
			String fname = en.getFname();
			String lname = en.getLname();
			String gender =  en.getGender(); 
			long phoneNo = en.getPhoneNo();
			String city = en.getCity();
			String state= en.getState();
			String country = en.getCountry();
			
			System.out.println(id+" "+ fname+" "+lname+" "+gender+" "+phoneNo+" "+city+ " "+ state+ " "+country);
		}
}
