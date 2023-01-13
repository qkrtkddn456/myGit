package ch16;

public class BankPlayer implements Runnable{
	String name;
	MyBank myBank;
	
	public BankPlayer(String name, MyBank myBank) {
		this.name = name;
		this.myBank = myBank;
	}
	
	@Override
	public void run() {
		switch (name) {
		case "hong": myBank.hong(); break;
		case "sa": myBank.sa(); break;
		case "lee": myBank.lee(); break;
		}
	}
}
