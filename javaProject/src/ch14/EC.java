package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EC {
	private int no;//주문번호
	private String orderDate;//주문일자
	private String product;//주문상품
	private String cardName;//카드명
	private String cardNo;//카드번호
	private int pay;//결제금액
	private Map<String, Object> map = new HashMap<>();
	private List<EC> list = new ArrayList<>();
	
	public void ecAdd() {
		list.add(new EC(1234, "2023-01-04", "하이트맥주", "삼성", "37918123468", 55900));
		list.add(new EC(2345, "2022-12-12", "꼬깔콘", "롯데", "35691123445", 23600));
		list.add(new EC(3456, "2023-01-01", "노트북", "현대", "36160123482", 2600000));
		map.put("list", list);
	}
	public void print() {
		ArrayList<EC> list2 = (ArrayList<EC>)map.get("list");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("---------------------------------------------------------------------");
		for(EC c : list2) {
			StringBuilder sb = new StringBuilder();
			sb.append(c.getCardNo());
			sb.replace(5, 9, "****");
			System.out.println(c.getNo()+"\t"+c.getOrderDate()+"\t"+c.getProduct()+"\t"+c.getCardName()+"\t"+
		sb+"\t"+String.format("%,d", c.getPay()));
		}
		System.out.println("---------------------------------------------------------------------");
	}
	
	public EC(int no, String orderDate, String product, String cardName, String cardNo, int pay) {
		this.no = no;
		this.orderDate = orderDate;
		this.product = product;
		this.cardName = cardName;
		this.cardNo = cardNo;
		this.pay = pay;
	}
	public EC() {
		
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
}
