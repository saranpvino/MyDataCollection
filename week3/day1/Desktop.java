package week3.day1;

public class Desktop extends Computer { // Child class extends Parent class
	public void desktopSize() {
		System.out.println("DESKTOP");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();	//Both Parent and child classes methods can be called
		d.desktopSize();
	}

}
