package 자바_예제문제실습;

public class 오버로딩 {
	public void test() {}
//	public void test(String s) {} // s str 같이쓸수없음
	public void test(String str) {}
	// 같은 매개변수 갯수를 가졌는데 같은 타입이면 오버로딩 되지않음
	private void test(int a) {} // a  i 같이쓸수없음
//	public void test(int i) {} 
	
	public void test(char a) {} // 접근제한자와 관계없이 
//	void test(char ch) {}       // 매개변수 갯수가 같고 타입이 같으면 불가 x
	public void test(long r,boolean a) {} // 아래와 같이 앞뒤  
	public void test(boolean b,long r) {} // 위치가 달라도 사용가능
	
	public void test(short s, double d) {}  
	public void test(short c, float f) {}// 각기 다른 매개타입 뒤에 넣어줌
	
	public void test(int a, String b) {}
	public void test(String b, char c) {}
	
	public void test(String c, double b) {}
	public void test(float f, int b) {}
	
	public void test(short a, boolean b) {}
	public void test(byte b, boolean c) {}
}
