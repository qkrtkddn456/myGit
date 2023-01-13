package ch13;

public class StrBuildEx {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("I am a");
		StringBuilder str2 = new StringBuilder(" Java Programmer");
		String str3 = "";
		str1 = str1.append(str2);
		System.out.println(str1);
		str3 = str1.toString();
		str3 = str3.replace("Java", "JSP");
		System.out.println(str3);
		str3 = str3.substring(7);
		System.out.println(str3);
		
	}
}
