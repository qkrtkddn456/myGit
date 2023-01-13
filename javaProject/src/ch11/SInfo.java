package ch11;

public class SInfo implements Student {
	int kor = 90;
	int eng = 85;
	int mat = 79;
	int sum = kor+eng+mat;
	double avg = sum / 3.0;

	@Override
	public void address() {
		System.out.println("이름\t주소\t이메일");
		System.out.println("홍길동\t서울 강남구\thong@gmail.com");
		System.out.println("-----------------------------------");
	}

	@Override
	public void point() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("홍길동\t%d\t%d\t%d\t%d\t%.1f\n",kor,eng,mat,sum,avg);
	}

}
