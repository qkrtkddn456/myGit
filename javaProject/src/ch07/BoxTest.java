package ch07;

public class BoxTest {
	public static void main(String[] args) {

		Box b;//객체데이터타입 참조변수;
		b = new Box();//객체 생성
		b.width = 20;
		b.length = 20;
		b.height = 30;
		System.out.println("상자의 가로, 세로, 높이는 " + b.width+"입니다.");
	}
	
	
}
