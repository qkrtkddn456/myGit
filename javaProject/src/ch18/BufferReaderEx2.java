package ch18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderEx2 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열 한줄을 입력하세요 : ");
		
		try {
			String str= reader.readLine();
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
