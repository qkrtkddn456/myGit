package ch13;

public class WrapperEx2 {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		char c1='4', c2='F';
		if(Character.isDigit(c1))
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2))
			System.out.println(c2+"는 영문자");
		
		//Integer
		System.out.println(Integer.parseInt("200"));
		System.out.println(Integer.toString(200));
		System.out.println(Integer.toBinaryString(200));
		
		Integer i = new Integer(200);
		System.out.println(i.doubleValue());//정수를 double값으로 변환(unboxing)
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b));//문자열로
		System.out.println(Boolean.parseBoolean("false"));//문자열 "false"실제 boolean으로 변환
	}

}
