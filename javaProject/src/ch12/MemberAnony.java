package ch12;

interface Member{
	int num = 1;
	String name = "김길동";
	String email = "kim@gmail.com";
	void print();
}

public class MemberAnony {
	public static void main(String[] args) {
		Member m = new Member() {
			
			@Override
			public void print() {
				System.out.println("고객번호 : "  + num);
				System.out.println("이름 : " + name);
				System.out.println("이메일 : " + email);
			}
		};
		m.print();
		
	}
}
