package ch10;


//static => 메모리에 바로로딩
//non-statc => 객체 생성 후에 로딩
//static method에서는 static안의 로컬변수나 static으로 정의된 멤버 변수만 사용 가능
public class A {
	String name = "kim";//non-static멤버
	static int n = 20;//static 멤버
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	public static void main(String[] args) {
		int a = 10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		
		A aa = new A();
		System.out.println(aa.name);
		System.out.println(n);
		aa.print();
	}
}	
