package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;

public class FileCopy2 {
	public static void main(String[] args) {
		OutputStream os = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String s = null;
		try {
			os=new FileOutputStream("c:\\test\\abc.txt");
			System.out.println("입력하세요 : ");
			while(true) {
				int in=System.in.read();
				if(in==13) break;
				os.write(in);
			}
			System.out.println("파일이 저장되었습니다.");
			br=new BufferedReader(new FileReader(new File("c:\\test\\abc.txt")));
			bw=new BufferedWriter(new FileWriter(new File("c:\\test\\abcCopy.txt")));
			while(true) {
				s=br.readLine();
				if(s==null) break;
				bw.write(s+"\r\n");
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(bw!=null) bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
