package ch02;

public class NameUnicode {
	public static void main(String[] args) {
		char a = '\ubc15';
		char b = '\uc0c1';
		char c = '\uc6b0';
		
		System.out.println("char형(\'\\ubc15\'):" + a);
		System.out.println("char형(\'\\uc0c1\'):" + b);
		System.out.println("char형(\'\\uc6b0\'):" + c);
	}
}
