package week3.day1;

public class Vehicle {
	public void driveVehicle() {
		System.out.println("Driving");
	}

	public void accelerate() {
		System.out.println("Accelerating");
	}

	public void applyBrake() {
		System.out.println("Applying brake");
	}

	public void fillFuel() {
		System.out.println("Filling Fuel");
	}

	public void shiftGear() {
		System.out.println("Changing Gear");
	}

	public static void main(String[] args) {
		Auto au = new Auto();
		Car ca = new Car();
		Audi audi = new Audi();
		Bmw bmw = new Bmw();
		Bajaj baj = new Bajaj();
		Mahindra mah = new Mahindra();
		
		ca.accelerate();
		ca.enableAirBag();
		//ca.shiftGear();

		audi.shiftGear(); // Overridden method in this class
		
		bmw.shiftGear();//No overridden here

		//au.shiftGear();
		au.fillFuel();
		au.applyBrake();
		System.out.println("Car Wheels: " + ca.wheelCar);
		System.out.println("Auto Wheels: " + au.wheelAuto);
	}
}
