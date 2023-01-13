package ch05;

public class GetMin {
	public static void main(String[] args) {
		int s[] = {12,3,19,6,18,8,12,4,1,19};
		int minimuin;
		minimuin = s[0];//minnimuin=12
		for(int i=1; i<s.length; i++) {
			if(s[i] < minimuin) {
				minimuin = s[i];//작은값으로 교체
			}
		}
		System.out.println("minimuin의 값 : " + minimuin);
	}
}
