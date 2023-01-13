package ch07;

public class Person {
	//멤버변수
	private double height;
	private String name;
	private int age;
	private String email;
	private String addres;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	//setter : set+변수명
	public void setName(String name) {
		this.name = name; //this=>멤버변수를 가리킴
	}
	//getter : get+변수명
	public String getName() {
		return name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	public void setAge(int age) {
		if(age < 0 || age > 150) {
			System.out.println("입력값이 정확하지 않습니다.");
		}else {
			this.age = age;			
		}
	}
	public int getAge() {
		return age;
	}
	public void print() {
		System.out.println("이름 : " + name+ ", 나이 : " +age+",키 : "+height);
	}
	public void print2() {
		System.out.printf("이름 : %s\n",name);
		System.out.printf("나이 : %d\n",age);
		System.out.printf("이메일 : %s\n",email);
		System.out.printf("주소 : %s\n\n",addres);
	}
}
