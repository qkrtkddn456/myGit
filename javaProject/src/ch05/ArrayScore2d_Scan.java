package ch05;

import java.util.Scanner;

public class ArrayScore2d_Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 : ");
		int score[][] = new int[sc.nextInt()][5];
		double[] avg = new double[score.length];
		char[] rank = new char[score.length];
		
		System.out.println("국, 영, 수 점수를 각각 입력하세요 : ");
		for(int i=0; i<score.length; i++) {
			System.out.print(i+1+"번 학생의 점수 : ");
			for(int j=1; j<score[i].length-1; j++) {
				score[i][j] = sc.nextInt();
				score[i][4] += score[i][j];
			}
			score[i][0] = i+1;
		}
		
		for(int i=0; i<score.length; i++) {
			avg[i] = score[i][4] / 3.0;
			if(avg[i] >= 90) {
				rank[i] = 'A';
			}else if(avg[i] >= 80) {
				rank[i] = 'B';
			}else if(avg[i] >= 70) {
				rank[i] = 'C';
			}else if(avg[i] >= 60) {
				rank[i] = 'D';
			}else if(avg[i] >= 50) {
				rank[i] = 'E';
			}else if(avg[i] >= 40) {
				rank[i] = 'F';
			}
			 
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(String.format("%.1f", avg[i])+ "\t" + rank[i] + "\t");
			System.out.println();
		}
		
		sc.close();
	}
}
