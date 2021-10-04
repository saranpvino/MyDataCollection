package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 23;
		boolean flag = false;
		
		// NOTE FOR LOOP ITERATIVE VALUES
		for (int i = 2; i < num / 2; i++) {
			// NOTE IF CONDITION TO CHECK PRIME
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("The given number is not a Prime number");
		} else {
			System.out.println("The given number is a Prime number");
		}
	}

}
