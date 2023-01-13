package ch12;

public class InnerExam1 {
	class cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();//외부객체를 먼저 생성
		InnerExam1.cal cal = t.new cal();//내부객체 생성
		cal.plus();
		System.out.println(cal.value);
	}
}
