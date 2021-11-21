package week1.day1;

public class SumofDigits {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;		//Find remainder
			sum = sum + rem;	//Adding remainder
			// System.out.println(sum);
			num = num / 10;		//Find quotient and set it as num again to iterate
			// System.out.println(num);
		}
		System.out.println(sum);
	}

}
