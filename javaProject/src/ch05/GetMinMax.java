package ch05;

public class GetMinMax {
	public static void main(String[] args) {
		int[] num = {79,88,91,33,100,55,95};
		int min = 100;
		int max = 0;
		
		for(int i=0; i<num.length; i++) {
			if(num[i] < min) 
				min = num[i];
			else if(num[i] > max) 
				max = num[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
