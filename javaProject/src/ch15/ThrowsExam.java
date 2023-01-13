package ch15;

public class ThrowsExam {
	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(1000);//Interrupt(cput 간섭)
		}
	}
}
