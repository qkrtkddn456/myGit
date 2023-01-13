package ch07;

public class TelevisonTest5 {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.setChannel(11);
		int ch = tv.getchannel();
		System.out.println(ch);
	}
}
