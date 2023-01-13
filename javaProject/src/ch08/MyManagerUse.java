package ch08;

//싱글톤 기법
public class MyManagerUse {
	public static void main(String[] args) {
		MyManager m = MyManager.getInstance();
		System.out.println(m);
		System.out.println("getscore : " + m.getScore());
		m.setScore(100);
		System.out.println("getscore : " + m.getScore());
		
		MyManager nm = MyManager.getInstance();
		System.out.println(nm);
		System.out.println("getscore : " + nm.getScore());
		
	}
}
