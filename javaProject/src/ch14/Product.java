package ch14;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
	private String num;//제품번호
	private String name;//제품명
	private String com;//제조회사
	private int price;//가격
	private int amount;
	private int money;
	private double tax;
	private List<Product> list = new ArrayList<>();
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("제품정보를 입력하려면 아무키나 누르세요.(종료를원하시면 0또는 exit를 입력하세요.)");
			String tmp = sc.next();
			if(tmp.equals("0") || tmp.equals("exit")) {
				break;
			}else {
				Product p = new Product();
				System.out.print("제품번호 : ");
				p.num = sc.next();
				System.out.print("제품명 : ");
				p.name = sc.next();
				System.out.print("제조사 : ");
				p.com = sc.next();
				System.out.print("단가 : ");
				p.price = Integer.parseInt(sc.next());
				System.out.print("수량 : ");
				p.amount = Integer.parseInt(sc.next());
				p.money = p.price * p.amount;
				p.tax = p.money * 0.1;
				list.add(p);
			}
		}
		sc.close();
	}
	public void print() {
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("=====================================================");
		System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t수량\t금액(천원)\t부가가치세");
		System.out.println("----------------------------------------------------");
		for(Product p : list) {
			String price = df.format(p.price);
			String money = df.format(p.money);
			System.out.printf("%s\t%s\t%s\t%s\t%d\t%s\t%.1f\n"
					,p.num,p.name,p.com,price,p.amount,money,p.tax);
		}
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}
