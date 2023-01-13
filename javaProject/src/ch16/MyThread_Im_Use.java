package ch16;

public class MyThread_Im_Use {
	public static void main(String[] args) {
		Thread s1 = new Thread(new MyThread_Im(),"스레드1");
		Thread s2 = new Thread(new MyThread_Im(),"스레드2");
		
		s1.setPriority(Thread.MIN_PRIORITY);
		s2.setPriority(Thread.MAX_PRIORITY);
		
		s2.start();
		s1.start();
	}
}
