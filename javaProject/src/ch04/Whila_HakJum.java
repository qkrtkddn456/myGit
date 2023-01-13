package ch04;

import java.util.Scanner;

public class Whila_HakJum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int count = 0;
		while(true) {
			System.out.print("아무정수나 입력하세요");
			num = sc.nextInt();
			if(num < 0) {
				break;
			}
			++count;
		}
		int kor[] = new int[count];
		int eng[] = new int[count];
		int mat[] = new int[count];
		int tot[] = new int[count];
		double avg[] = new double[count];
		char r[] = new char[count];
		String[] result = new String[count];
		for(int i=0; i<count; i++) {
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
		for(int i=0; i<count; i++) {
			System.out.println(result[i]);
		}
	}
}
