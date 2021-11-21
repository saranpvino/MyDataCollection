package week3.day2;

public class ConcreteDesktop implements HardWare, SoftWare { // CONCRETE CLASS

	public void hardwareResources() {
		System.out.println("Hardware from interface1");
	}

	public void softwareResources() {
		System.out.println("Software from interface2");
	}

	public void ownMethod1() {
		System.out.println("My own method 1 not from any interfaces but from concrete class");
	}

	public static void main(String[] args) {
		ConcreteDesktop ds = new ConcreteDesktop();
		ds.hardwareResources();
		ds.ownMethod1();
		ds.softwareResources();
	}

}
