package ch07;

public class Student2 {//getter,setter 활용 안하는 방법
	//멤버변수
	private String name;
	private String major;//전공
	private int year;
	private String num;
	private double point;
	private int money;
	private int save;

	public void input(String name, String major, int year,
			String num, double point, int money) {
		this.name=name;
		this.major=major;
		this.year=year;
		this.num=num;
		this.point=point;
		this.money=money;
		//장학금 계산(3.5이상 100만원, 4.0이상 250만원, 4.3이상 전액)
		if(point >= 4.3)
			save = money;
		else if(point >= 4.0)
			save = 250;
		else if(point >= 3.5)
			save = 100;
	}
	public void print() {
		System.out.println("이름\t전공\t학년\t학번\t평점평균\t등록금\t장학금");
		System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"
				+point+"\t"+money+"\t"+save);
	}

}
