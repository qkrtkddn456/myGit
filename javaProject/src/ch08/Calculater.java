package ch08;

public class Calculater {
	private int left;
	private int right;
	
	public Calculater() {//기본생성자는 명시적으로 개발자가 처리안하면 컴파일러는 눈에안보이게 자동으로 만들ㅇ러준다.
		//단, 다른생성자를 만들시는 기본생성자 호출을 할 경우 반드시 개발자가 처리해야한다.
		System.out.println("기본 생성자 호출 ..");
	}
	public Calculater(int left, int right) {
		System.out.println("매개변수가 있는 생성자 호출...");
		this.left=left;
		this.right=right;
	}
	
	//getter,setter추가
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public void sum() {
		System.out.println(left+right);
	}
	public void avg() {
		System.out.println((left+right)/2);
	}
}
