package ch11;

public class Test2 extends Test{

	@Override
	public void print() {//구현부만 있으면된다.
		System.out.println("추상 클래스 구현");
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		//추상클래스는 생성이안된다. new Test (x)
		t.print();
	}
}
