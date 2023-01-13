package ch04;

public class BreakEx4 {
	public static void main(String[] args) {
		int n = 1;
		while(n != 8) {
			System.out.println(n + " Hello World");
			++n;
		}
		System.out.printf("n값이 %d이며 while문 빠져나옴", n);
	}
}
