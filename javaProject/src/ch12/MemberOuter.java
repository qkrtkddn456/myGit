package ch12;

public class MemberOuter {
	int num = 1;
	private String name = "홍길동";
	String email = "hong@gmail.com";
	class Inner{
		public void print() {
			System.out.println("일반");
			System.out.println("고객번호 : " + num);
			System.out.println("이름 : " + name);
			System.out.println("이메일 : " + email);
		}
	}
	static class Inner2{
		MemberOuter m = new MemberOuter();
		
		public void print() {
			System.out.println("static");
			System.out.println("고객번호 : " + m.num);
			System.out.println("이름 : " + m.name);
			System.out.println("이메일 : " + m.email);
		}
	}
	public static void main(String[] args) {
		MemberOuter m = new MemberOuter();
		Inner i = m.new Inner();
		i.print();
		
		MemberOuter.Inner2 m2 = new MemberOuter.Inner2();
		
		m2.print();
		
		
		
	}
}
