package week1.day2;

public class Calculator {

	String strVar = "Hello  world"; // Global or Instance Variable
	static int num1 = 1;			//Static Variable
	// int num1	=	1;				// Global or Instance Variable
	
	// Global or instance methods
	// BUT THIS IS STATIC.So it can be called without object from this main method.
	public static int add(int num1, int num2, int num3) {
		int result = num1 + num2 + num3; // Local Variable
		return result;
	}

	public int sub(int num1, int num2) {
		int result = 0;
		if (num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		return result;
	}

	public double mul(double num1, double num2) {
		double result = num1 * num2;
		return result;

	}

	public float div(float num1, float num2) {
		float result = num1 / num2;
		return result;
	}

	public static void main(String[] args) {
		/*
		 * //NOT WRONG TO CALL STATIC LIKE THIS Calculator calc = new Calculator(); int
		 * res = calc.add(calc.num1, 9, 10);
		 */
		 
// calling static method and using static variable from static main method WITHOUT OBJECT
		int res = add(num1, 2, 3);
		System.out.println(res);

	}

}
