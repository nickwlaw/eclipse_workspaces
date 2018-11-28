package ch07_prj5_Calculator;

public class Calculator {
	
	int intSum;
	double dblSum;
	
	public Calculator(int int1, int int2) {
		intSum = int1+int2;
	}
	
	public Calculator(int int1, int int2, int int3) {
		intSum = int1+int2+int3;
	}
	
	public Calculator(double dbl1, double dbl2) {
		dblSum = dbl1+dbl2;
	}
	
	public Calculator(double dbl1, double dbl2, double dbl3) {
		dblSum = dbl1+dbl2+dbl3;
	}

	public int getIntSum() {
		return intSum;
	}

	public double getDblSum() {
		return dblSum;
	}
	
}
