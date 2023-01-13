package ch11;

public class Boat implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Boat SppedUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Boat SppedDown");
	}

	@Override
	public void handle() {
		System.out.println("Boat Handling");
	}

}
