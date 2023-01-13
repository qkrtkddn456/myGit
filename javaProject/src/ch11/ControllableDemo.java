package ch11;

public class ControllableDemo {
	public static void main(String[] args) {
//		TV tv= new TV();
//		tv.turnOn();
//		tv.turnOff();
//		tv.remoteOn();
//		tv.remoteOff();
//		tv.repair();
//		Controllable.reset();
//		
//		Computer c = new Computer();
//		c.turnOn();
//		c.turnOff();
//		c.repair();
		Controllable n = new Notebook();
		
		n.turnOn();
		n.turnOff();
		n.repair();
		Controllable.reset();
		
	}
}
