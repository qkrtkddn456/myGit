package ch09;

class Bank{
	double GetIntersetRate() {
		return 0.0;
	}
}

class BadBank extends Bank{
	//@ : 어노테이션(Annotation)이라고 하며 컴파일러에게 추가적인 정보를 제공하는 메타데이터로
	//주석으로 활용하거나 또는 프로그램에게 특정기능을 정의하거나 실행하도록 정보 제공용으로 사용한다.
	//스프링에서는 본격적으로 활용한다.
	@Override
	double GetIntersetRate() {//메소드 오버라이딩(재정의)
		return 10.0;
	}
}

class NormalBank extends Bank{
	@Override
	double GetIntersetRate() {
		return 5.0;
	}
}

class GoodBank extends Bank{
	@Override
	double GetIntersetRate() {
		return 3.0;
	}
}

public class BankTest {
	public static void main(String[] args) {
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율 : " + b1.GetIntersetRate());
		System.out.println("NormalBank의 이자율 : " + b2.GetIntersetRate());
		System.out.println("GoodBank의 이자율 : " + b3.GetIntersetRate());
		
		
	}
}
