package ch16;

public class MyThread_Ex extends Thread{
	String str;
	
	public MyThread_Ex(String str) {
		this.str = str;
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(str + "==>" + i);
		}
	}
}
