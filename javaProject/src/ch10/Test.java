package ch10;

public class Test {
	static int a;
	int b;
	void print() {
		//n-s메소드에서는 static,n-s멤버변수를 모두 쓸 수있다.
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		
		Test t = new Test();
		System.out.println(t.b);//new를 해야한 ns인 b를 쓸수있다.
		t = null;
		//System.out.println(t.b);
		System.out.println(Math.PI);//대표적인 static멤버
	}
}
