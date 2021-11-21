package week3.day2;

public class MyPC extends AbstractDesktop {//Concrete class extends abstract class(//single inheritance)

	public void hardwareResources() {
		System.out.println("Hardware from interface1");
	}
	public static void main(String[] args) {
		MyPC pc=new MyPC();
		pc.hardwareResources();
		pc.softwareResources();
		pc.ownMethod2();
	}

}
