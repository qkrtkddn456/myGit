package ch11;

public class Car implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Car SppedUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Car SppedDown");
	}

	@Override
	public void handle() {
		System.out.println("Car Handling");
	}

}
