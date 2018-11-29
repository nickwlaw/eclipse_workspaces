package ch07_prj1_ContactList;

public class ContactListApp {

	public static void main(String[] args) {
		
		// welcome the user
		System.out.println("Welcome to the Contact List Application");
		
		boolean cont = true;
		while (cont == true) {
			
			// get user input
			Contact contact = new Contact();
			contact.setFirstName(Console.getString("Enter First Name: "));
			contact.setLastName(Console.getString("Enter Last Name: "));
			contact.setEmail(Console.getString("Enter E-Mail: "));
			contact.setPhoneNumber(Console.getString("Enter Phone Number: "));
			
			// display contact to user
			System.out.println("");
			System.out.println(contact.displayContact());
			
			// ask to continue?
			cont = Console.askToContinue();
			
		}
		System.out.println("");
		System.out.println("Goodbye!");

	}

}
