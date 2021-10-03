package week1.day1;

public class MyFirstJavaProgram {

	public static void main(String[] args) {
		System.out.println("WELCOME TO MY CODES");
		int num = 30;
		// Divisible by 3 or 5
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("TRIZZ-FIZZ");
		} else if (num % 3 == 0) {
			System.out.println("TRIZZ");
		} else {
			System.out.println("FIZZ");
		}
		// Positive or Negative
		if (num > 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
		// Odd or Even
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
