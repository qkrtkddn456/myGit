package ch04;

import java.util.Scanner;

public class While_Gugu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		int dan = sc.nextInt();
		sc.close();
		int i = 1;
		while(i <= 9)
		{
			System.out.println(dan + " x " + i + " = " + dan * i);
			i++;
			
		}
	}
}
