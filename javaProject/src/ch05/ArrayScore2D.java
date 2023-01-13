package ch05;

public class ArrayScore2D {
	public static void main(String[] args) {
		int[][] score = {{1,100,100,100,300},{2,89,76,92,257}
		,{3,88,69,72,229},{4,45,60,59,164},{5,96,92,89,277}};
		double[] avg = new double[score.length];
		char[] rank = new char[score.length];
		
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
	}
}
