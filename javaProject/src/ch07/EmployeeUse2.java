package ch07;

public class EmployeeUse2 {
	public static void main(String[] args) {
		Employee2 em = new Employee2();
		em.setName("김철수");
		em.setDepa("관리부");
		em.setPosition("과장");
		em.setPay(300);
		em.setBonus(900);
		em.setTot(1200);
		em.setTax(39);
		em.setMoney(1161);
		
		em.print();
	}
}
