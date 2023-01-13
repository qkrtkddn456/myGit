package ch08;

public class PersonUse {
	public static void main(String[] args) {
		Person p= new Person();
		p.showInfo();
		
		Person p2 = new Person("추신수");
		p2.showInfo();
		
		Person p3= new Person("류현진",191);
		p3.showInfo();
	}
}
