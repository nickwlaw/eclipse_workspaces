public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
//        Product product = new Product();

        // fill the Product object with data
//        product.setCode(productCode);
        if (productCode.equalsIgnoreCase("java")) {
            Product product = new Product("java","Murach's Java Programming",57.50);
            return product;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Product product = new Product("jsp","Murach's Java Servlets and JSP",57.50);
            return product;
        } else if (productCode.equalsIgnoreCase("mysql")) {
        	Product product = new Product("mysql","Murach's MySQL",54.50);
        	return product;
        } else {
        	Product product = new Product("Unknown","Unknown",0.00);
        	return product;
        }
    }
}