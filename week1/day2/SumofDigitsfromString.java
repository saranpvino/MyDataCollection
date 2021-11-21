package week1.day2;

public class SumofDigitsfromString {

	public static void main(String[] args) {
		String str = "Tes12Le79af65";

		// One of the methods to get digits(using REGULAR EXPRESSION) from string
		/*
		 * String replaceAll = str.replaceAll("[\\D]", "");//To get only digits
		 * System.out.println(replaceAll);
		 */

		// Another method to get digits from string

		char[] charArray = str.toCharArray();
		int num = 0;
		int sum = 0;
		int rem = 0;
		System.out.println("Digits from String: ");
		for (int i = 0; i < charArray.length; i++) {
			boolean digit = Character.isDigit(charArray[i]);//To check digits from string
			if (digit) {
				// Printing Digits
				System.out.print(charArray[i]);
				num = Character.getNumericValue(charArray[i]); // Here num is 127965 //Adding digitsLogic
				while (num > 0) {
					rem = num % 10; // Getting remainder
					sum = sum + rem;// Adding remainder
					num = num / 10; // Getting quotient to execute while loop again
				}
			}
		}
		System.out.println();
		System.out.println("Sum of Digits: " + sum);

	}

}
