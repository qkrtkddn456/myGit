package ch04;

public class Do_while_Ex1 {
	public static void main(String[] args) {
		int i=1;
		do {//먼저실행
			System.out.print(i);
			i++;//증감식
		}while(i<=10);//조건식(나중에 검사, ;마지막에 반드시찍어야함)
	}
}
