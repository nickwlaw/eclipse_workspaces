package ch08_prj3_AreaCalculator;

public class Circle extends Shape {
	
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
		

}
