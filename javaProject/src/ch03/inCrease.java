package ch03;

public class inCrease {
	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		j = i++; //i의 값을 1증가시킴(나중에 계산)
		System.out.println(i + "," + j);
		
		i = 5;
		j = ++i;
		System.out.println(i + "," + j);
	}
}
