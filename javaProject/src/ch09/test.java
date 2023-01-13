package ch09;

public class test {
	
	public static void main(String[] args) {
		
		int[] arr = new int[4];
		for(int i=0; i<arr.length ; i++) {
			arr[i] += (10 + i );
			System.out.println(arr[i]);
			
		}
	}
}
