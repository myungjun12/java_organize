package 자바_예제문제실습;

public class 배열 {
	
	public static void main(String[] args) {
		Circle[] 원들 = new Circle[2];
		원들[0] = new Circle(2.5);
		원들[1] = new Circle(3.5);
		for(int i = 0; i < 원들.length; i++) {
			System.out.println("원들["+i+"]" + 원들[i].getRadius());
		}
	}
}
