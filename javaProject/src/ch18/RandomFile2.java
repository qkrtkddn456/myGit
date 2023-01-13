package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public class RandomFile2 {
	public static void main(String[] args) {
		OutputStream os = null;
		RandomAccessFile file = null;
		try {
			os = new FileOutputStream("c:\\test\\rand2.txt");
			System.out.println("내용을 입력하세요 : ");
			while(true) {
				int in=System.in.read();
				if(in==13) break;
				os.write(in);
			}
			System.out.println("파일이 생성되었습니다.");
			file=new RandomAccessFile("c:\\test\\rand2.txt", "rw");
			file.seek(9);
			file.write("park".getBytes());
			file.close();
			System.out.println("내용이 변경되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
