package ch07_prj1_ContactList;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	
	public Contact() {
		firstName = "";
		lastName = "";
		email = "";
		phoneNumber = "";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String displayContact() {
		String message = "----------------------------------------\n"
					   + "---- Current Contact -------------------\n"
					   + "----------------------------------------\n"
					   + "Name:          "+firstName+" "+lastName+"\n"
					   + "Email Address: "+email+"\n"
					   + "Phone Number:  "+phoneNumber+"\n"
					   + "----------------------------------------\n";
		return message;
	}

}
