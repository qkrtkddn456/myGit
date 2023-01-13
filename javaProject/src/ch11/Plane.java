package ch11;

public class Plane implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Plane SppedUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Plane SppedDown");
	}

	@Override
	public void handle() {
		System.out.println("Plane Handling");
	}

}
