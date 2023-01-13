package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		String str = "Hello 1234";
		System.out.println("(Chracter 사용)");
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				System.out.println(str.charAt(i) + "는 대문자입니다.");
			}else if(Character.isLowerCase(str.charAt(i))) {
				System.out.println(str.charAt(i) + "는 소문자 입니다.");
			}else if(Character.isDigit(str.charAt(i))) {
				System.out.println(str.charAt(i)+"는 숫자 입니다.");
			}
		}
		
		System.out.println("--------------------------");
		System.out.println("(Integer 사용)");
		System.out.println("문자 " + str.substring(6)+"입니다");
		System.out.println("숫자 " + Integer.parseInt(str.substring(6)) + "입니다");
		System.out.println("숫자 " + Integer.parseInt(str.substring(6))
		+ "+2 = " + (Integer.parseInt(str.substring(6)) + 2) + "입니다." );
	}
}
