package ch18;

import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderWhile {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		System.out.print("내용을 입력하세요 :");
		try {
			int code = isr.read();
			while(code != 13) {
				System.out.println((char)code+"==>"+code);
				code = isr.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
