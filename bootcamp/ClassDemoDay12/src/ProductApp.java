
public class ProductApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product App");
		
		Product yelenasBook = new Product();
		yelenasBook.setCode("Java");
		yelenasBook.setDescription("Murach's Java Programming");
		yelenasBook.setPrice(57.50);
		
		System.out.println("Yelena's Book : "+yelenasBook.getCode()
						+  ", "+yelenasBook.getDescription()
						+  ", "+yelenasBook.getPrice());
		
		Product garysBook = new Product("Java","Murach's Java Programming",57.50);
		System.out.println(garysBook);
		

	}

}
