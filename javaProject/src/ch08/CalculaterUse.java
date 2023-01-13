package ch08;

public class CalculaterUse {
	public static void main(String[] args) {
		Calculater c = new Calculater();//객체생성 및 기본생성자 호출
		//입력
		c.setLeft(10);
		c.setRight(20);
		//출력
		System.out.println(c.getLeft());
		System.out.println(c.getRight());
		c.sum();
		c.avg();
		
		Calculater c2 = new Calculater(10,20);
		c2.sum();
		c2.avg();
		
		
		
	}
}
