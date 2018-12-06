package ch08_prj3_AreaCalculator;

public class Rectangle extends Square {
	
	double height;
	
	public Rectangle(double width, double height) {
		super(width);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return this.width*this.height;
	}

}
