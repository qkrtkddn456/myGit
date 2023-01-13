package ch03;

import java.util.Scanner;

public class JumSoo {
	public static void main(String[] args) {
		String name;
		int java, db, html, jsp, tot;
		double avg;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("Java : ");
		java = scan.nextInt();
		System.out.print("DB : ");
		db = scan.nextInt();
		System.out.print("HTML : ");
		html = scan.nextInt();
		System.out.print("JSP : ");
		jsp = scan.nextInt();
		scan.close();
		
		tot = java + db + html + jsp;
		avg = tot / 4.0;
		
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f", name, java, db, html, jsp, tot, avg);
		
		
	}
}
