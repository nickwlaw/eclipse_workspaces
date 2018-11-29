
public class Product {
	
	private String code;
	private String description;
	private double price;
	
	public Product() {
		super();
	}

	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String c) {
		this.code = c;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String d) {
		this.description = d;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double p) {
		this.price = p;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}

}
