package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		// Printing Instance Variable
		String strPrint = calc.strVar;
		System.out.println(strPrint);
		
		//Calculating Instance Methods
		//Note it is static in Class Calculator.
		//But here we need an OBJECT to call this static method
		int addResult = calc.add(8, 9, 10);
		int subResult = calc.sub(50, 100);
		double mulResult = calc.mul(15.5, 5.5);
		float divResult = calc.div(1.2f, 3.1f);
		System.out.println("Adding Values: " + addResult);
		System.out.println("Subtracting Values: " + subResult);
		System.out.println("Multiplication Values: " + mulResult);
		System.out.println("Division Values: " + divResult);
	}

}
