package ch08;

class Cicle{
	double radius;
	String color;
	public Cicle(double r, String c) {
		radius = r;
		color = c;
	}
	public Cicle(double r) {
		radius = r;
		color = "파랑";
	}
	public Cicle(String c) {
		radius=21.0;
		color=c;
	}
	public Cicle() {
		radius = 3.5;
		color = "빨강";
	}
	public void print() {
		System.out.println("반지름 : " + radius);
		System.out.println("색깔 : " + color);
	}
}
public class CircleDemo {
	public static void main(String[] args) {
		Cicle c = new Cicle(10.0,"빨강");
		c.print();
		
		Cicle c2 = new Cicle(5.0);
		c2.print();
		
		Cicle c3 = new Cicle("노랑");
		c3.print();
		
		Cicle c4 = new Cicle();
		c4.print();
	}
}
