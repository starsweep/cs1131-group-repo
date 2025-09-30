public class Road {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.start();
		v.honk();

		Vehicle b = new Bicycle();
		b.start();
		b.bell();
	}
}

public class Vehicle {
	public void start() {
		System.out.println("Vehicle Start");
	}
 
	public void honk() {

	}

	public void bell() {

	}

	public static void main(String [] args) {

	}
}

public class Car extends Vehicle {
	public void start() {
		System.out.println("Car ignition turns on");
	}

	public void honk() {
		System.out.println("car honk");
	}

	public static void main(String [] args) {

	}
}

public class Bicycle extends Vehicle {
	public void start() {
		System.out.println("Pedels moving");
	}

	public void bell() {
		System.out.println("Ring bell");
	}

	public static void main(String [] args) {

	}
}
