package ch08_prj2_PersonManager;

public class Customer extends Person {
	
	private String customerNumber;
	
	public Customer(String firstName, String lastName, String customerNumber) {
		super(firstName, lastName);
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return super.toString()+"\nCustomer Number: "+customerNumber;
	}
	
}
