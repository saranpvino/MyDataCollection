package week3.day1;

public class Computer { // Parent class
	public void computerModel() {
		System.out.println("COMPUTER");
	}

	public static void main(String[] args) {
		Computer c = new Computer();
		c.computerModel();	//only parent class methods can be called
	}

}
