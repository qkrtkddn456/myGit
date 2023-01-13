package ch10;

class Pa3{
	int num = 10;
	String name = "홍길동";
	public void print() {
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
	}
}

class Ch3 extends Pa3{
	String email = "hong@gmail.com";
	String tel = "010-1234-5678";
	@Override
	public void print() {
		super.print();
		System.out.println("이메일 : "+email);
		System.out.println("전화 : "+tel);
	}
}


public class Poly3 {
	public static void main(String[] args) {
		String addr = "서울 강남구 역삼동";
		Pa3 c = new Ch3();
		c.print();
		System.out.println("주소 : " +addr);
	}
}
