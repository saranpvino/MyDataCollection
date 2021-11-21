package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int num = 10;
		int fact = 1;
		int i = 1;
		// System.out.println(num);
		while (i <= num) {
			System.out.println("Factorial Numbers: " + i);
			fact = fact * i; // NOTE FORMULA FOR FACTORIAL INSIDE ANY LOOP
			i++;
		}
		System.out.println("Factorial Value: " + fact);
	}

}
