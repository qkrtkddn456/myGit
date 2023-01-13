package ch04;

import java.util.Scanner;

public class ForPoint {
	public static void main(String[] args) {
		int kor[] = new int[3];
		int eng[] = new int[3];
		int mat[] = new int[3];
		int tot[] = new int[3];
		double avg[] = new double[3];
		char r[] = new char[3];
		String[] result = new String[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("국어 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학 : ");
			mat[i] = sc.nextInt();
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] =tot[i] / 3.0;
			if(avg[i] >=90) {
				r[i] = '수';
			}else if(avg[i] >=80) {
				r[i] = '우';
			}else if(avg[i] >=80) {
				r[i] = '미';
			}else if(avg[i] >=70) {
				r[i] = '양';
			}else{
				r[i] = '가';
			}
			result[i] = kor[i] + "\t" + eng[i]+ "\t" + mat[i]+ "\t" 
			+ tot[i]+ "\t" + String.format("%.1f", avg[i])+ "\t" + r[i];
		}
		sc.close();
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<3; i++) {
			System.out.println(result[i]);
		}
		
	}
}
