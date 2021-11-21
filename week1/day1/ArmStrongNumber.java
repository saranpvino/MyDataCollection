package week1.day1;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// int num = 135;
		int num = 153;
		double calculated = 0;
		double remainder;
		int original = num;
		// int i = 0;
		while (original > 0) {
			//NOTE TO CALCULATE ARMSTRONG NUMBER
			remainder = original % 10;
			original = original / 10;
			calculated = calculated + Math.pow(remainder, 3);
		}

		if (calculated == num) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
