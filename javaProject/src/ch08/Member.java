package ch08;

public class Member {
	private String name;
	private String userid;
	private int money;
	private String grade;
	
	public Member(String name, String userid, int money) {
		setName(name);
		setUserid(userid);
		setMoney(money);
		if(this.money >= 100000) {
			this.grade = "gold";
		}else {
			this.grade = "silver";
		}
	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.printf("%s\t%s\t%d\t%s",name,userid,money,grade);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getGrade() {
		return grade;
	}
//	public void setGrade(String grade) {
//		this.grade = grade;
//	}
	
	
}
