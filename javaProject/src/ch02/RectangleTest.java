package ch02;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이를 입력하세요 :");
		double weight = scan.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 :");
		double height = scan.nextDouble();
		
		double area = weight * height;
		System.out.println("직사각형이 넓이는 " + area + " 입니다.");
		scan.close();
	}
}
