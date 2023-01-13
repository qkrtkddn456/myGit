package ch09;

public class Manager extends Employee{
	private int yearpay;
	private double bonus;
	//생성자
	public Manager() {}
	public Manager(int num, String name, String adress, String email, String rrn
			,int salary) {
		super.setNum(num);
		super.setRrn(rrn);
		super.name = name;
		super.adress = adress;
		super.email = email;
		super.salary = salary;
		this.yearpay = salary * 12;
		this.bonus = this.salary * 3.6;
		
	}
	//getter,setter
	public int getYearpay() {
		return yearpay;
	}
	public void setYearpay(int yearpay) {
		this.yearpay = yearpay;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	//print
	public void print() {
		System.out.printf("사번 : %d\n이름 : %s\n"
				+ "주소 : %s\n이메일 : %s\n주민번호 : %s\n"
				+ "연봉 : %d\n보너스 : %.1f\n",super.getNum(),super.name
				,super.adress,super.email,super.getRrn(),this.yearpay,this.bonus);
	}
}
