package week3.day2;

public abstract class AbstractDesktop implements HardWare, SoftWare {//8 level inheritance

	/*
	 * public void hardwareResources() {
	 * System.out.println("Hardware from interface1"); }
	 */

	public void softwareResources() {
		System.out.println("Software from interface2");
	}

	public void ownMethod2() {
		System.out.println("My own method 2 not from any interfaces but from abstract class");
	}

	public static void main(String[] args) {

	}

}
