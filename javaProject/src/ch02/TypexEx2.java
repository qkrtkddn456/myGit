package ch02;

public class TypexEx2 {

	public static void main(String[] args) {
		int mach;
		int distacne;
		mach = 340; //소리는 1초에 340미터를 이동
		distacne = mach * 60 * 60;
		System.out.println("소리가 1시간 동안 가는 거리 : " + distacne + "m");
		
		double radius;
		double area;
		radius = 10.0d;//d는 생략가능
		area = radius * radius * 3.14;
		System.out.println("반지름이  "+ radius + "인 원의 넓이 : " + area);
	}
}
