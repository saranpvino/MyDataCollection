package week3.day1;

import org.apache.poi.ss.formula.functions.Fixed;

public class AxisBank extends BankInfo {
	// static int i=1;
	@Override
	public void deposit() {
		// super.deposit();
		// this.i=1; //this class variable i not static
		System.out.println("Overridden");
	}

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		// System.out.println(i);//static int
		a.fixed();
		a.deposit();
		a.saving();
	}

}
