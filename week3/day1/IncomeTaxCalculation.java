package week3.day1;

public class IncomeTaxCalculation implements TaxCalculation, IncomeCalculation {//Taking ABSTRACT from INTERFACE

	// UNIMPLEMENTED METHODS FROM INTERFACE
	public void sub(int x, int y) {
		int diff = x - y;
		System.out.println("Subtracting	Integers: " + diff);
	}

	public void add(int x, int y) {
		int sum = x + y;
		System.out.println("Adding Integers: " + sum);
	}

	public void mul(int x, double y) {
		double mul = x * y;
		System.out.println("Multiplying Double: " + mul);

	}

	public void mul(int x, int y) {
		int mul = x * y;
		System.out.println("Multiplying Integers: " + mul);
	}

	// OWN METHOD
	public void div(int x, int y) {
		int div = x / y;
		System.out.println("Dividing Integers: " + div);
	}

	// MAIN METHOD
	public static void main(String[] args) {
		IncomeTaxCalculation calc = new IncomeTaxCalculation();
		calc.add(1, 2);
		calc.mul(1, 2.1);
		calc.mul(1, 2);
		calc.sub(2, 1);
		calc.div(2, 1);
	}
}
