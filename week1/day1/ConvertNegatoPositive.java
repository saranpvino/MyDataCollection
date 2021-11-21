package week1.day1;

public class ConvertNegatoPositive {

	public static void main(String[] args) {
		int num = -30;

		// int PosiNum = Math.abs(num); //Using builtin function

		// Convert positive to negative or negative to positive
		int PosiNum = 0 - num;

		System.out.println("The number " + num + " is coverted into " + PosiNum);
	}

}
