package ch05;

import java.util.Scanner;

public class ArrayPoint2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] mat = new int[2];
		int[] tot = new int[2];
		double[] avg = new double[2];
		double tot_avg = 0.0;
		
		for(int i=0; i<name.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.next();
			System.out.print("국어점수 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어점수 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학점수 : ");
			mat[i] = sc.nextInt();
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = (double)tot[i] / 3.0;
			tot_avg += avg[i];
		}
		for(int i=0; i<name.length; i++) {
			System.out.println("이름 : " + name[i]);
			System.out.println("국어 : " + kor[i]);
			System.out.println("영어 : " + eng[i]);
			System.out.println("수학 : " + mat[i]);
			System.out.println("총점 : " + tot[i]);
			System.out.printf("평균 : %.1f\n\n", avg[i]);
		}
		System.out.println("===============");
		System.out.printf("학급평균 : %.1f\n", tot_avg/(double)name.length);
		sc.close();
	}
	
}
