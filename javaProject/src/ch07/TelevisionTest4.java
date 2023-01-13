package ch07;

public class TelevisionTest4 {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		int ch = tv.getchannel();
		System.out.println("현재 채널은 " + ch + "입니다.");
	}
}
