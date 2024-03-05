package oopsbyashokIt;

public class Encapsulation {
	//--Encapsulation is used to combine our variables and methods are single entity/unit
	//--Encapsulation provides data hiding
	//--We can achieve encapsulation using classes
	//--The main aim of Encapsulation is Security
	//Eg- MultipleTablets
	//     java class
	//---Nobody can modify the value.
	//  ----you can't re-useabilty
	
	/* private long accNum;
	   private String name;

		
		 //For Account Number
		public void setAcc(long accNum) {
			this.accNum = accNum;
		}
		public long getAcc() {//To call get the value first check data type of the value
			return accNum;
		}

	//For Name	
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
	*/
	
	// Take Another Example
	private int id;
	private String fname;
	private String lname;
	private String gender;
	private long phoneNo;
	private String city;
	private String state;
	private String country;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
