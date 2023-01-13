package ch06;

public class StudentPoint {
	static int[][] score = {{1001,90,85,99,76}
	,{1002,95,79,88,92}
	,{1003,84,92,95,72}};
	static String[] name = {"홍길동","사임당","이순신"};
	static int tot[] = new int[3];
	static double avg[] = new double[3];
	
	public static void get_score(int[][] st) {
		get_tot(st);
		get_avg();
	}
	public static void get_tot(int[][] st) {
		for(int i=0; i<st.length; i++) {
			for(int j=1; j<st[i].length; j++) {
				tot[i] += st[i][j];
			}
		}
		
	}
	public static void get_avg() {
		for(int i=0; i<tot.length; i++) {
			avg[i] = tot[i] / 4.0;
		}
	}
	
	public static void print() {
		System.out.println("전체학생수 : " + name.length);
		System.out.println("---------------------------------------------------------");
		System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("---------------------------------------------------------");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%.1f\n"
					,score[i][0],name[i],score[i][1],score[i][2]
							,score[i][3],score[i][4],tot[i],avg[i]);
		}
		System.out.println("---------------------------------------------------------");
		
	}
	
	public static void main(String[] args) {
		get_score(score);
		print();
	}
}
