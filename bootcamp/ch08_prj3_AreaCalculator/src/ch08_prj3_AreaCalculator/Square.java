package ch08_prj3_AreaCalculator;

public class Square extends Shape {
	
	double width;
	
	public Square(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return this.width*this.width;
	}
	
	

}
