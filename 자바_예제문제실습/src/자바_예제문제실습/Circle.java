package 자바_예제문제실습;

public class Circle {

	public static final double PI = 3.14;
	public double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	// Setter // Getter 
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("반지름 " + radius + "cm인 원을 그립니다.");
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(2.5);
		circle.draw();
	}
}
