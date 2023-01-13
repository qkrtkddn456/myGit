package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank bank = new MyBank();
		Thread hong = new Thread(new BankPlayer("hong",bank),"hong");
		Thread sa = new Thread(new BankPlayer("sa",bank),"sa");
		Thread lee = new Thread(new BankPlayer("lee",bank),"lee");
		
		hong.start();
		sa.start();
		lee.start();
	}
}
