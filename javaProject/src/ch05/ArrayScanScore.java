package ch05;

import java.util.Scanner;

public class ArrayScanScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student;
		int tot = 0;
		double avg = 0;
		
		System.out.print("성적처리할 학생 수를 입력하세요 : ");
		student = new int[sc.nextInt()];
		
		for(int i=0; i<student.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			student[i] = sc.nextInt();
			tot += student[i];
		}
		avg = (double)tot / student.length;
		
		System.out.println("총점은 " + tot + "점 입니다.");
		System.out.printf("평균성적은 %.1f점 입니다.",avg );
		
		sc.close();
			
	}
}
