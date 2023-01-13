package ch09;

public class CircleShape extends Shape{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public CircleShape(int radius) {
		super("Circle");//매개변수가 있는 부모 생성자호출
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}
	@Override
	public void draw() {
		System.out.print("반지름이 "  + radius + "인 원 ");
		super.draw();
	}
	
}
