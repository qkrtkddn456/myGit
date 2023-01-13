package ch09;

public class Employee {
	private int num;//사번
	private String rrn; //주민번호
	protected int salary; //월급
	
	public String name;//이름
	String adress; //주소
	String email; //이메일
	
	//getter, setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
}
