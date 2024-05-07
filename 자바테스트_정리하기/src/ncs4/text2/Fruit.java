package ncs4.text2;

public class Fruit implements Comparable<Fruit>{
//필드
	private String name;
	private int price;
	private int quantity;
	//기본생성자
	public Fruit() {}
	//필수생성자   
	public Fruit(String name, int price, int quantity) {
		super();
		this.name = name; //과일명
		this.price = price; //과일가격
		this.quantity = quantity; //과일수량
	}
	//toString
	@Override
	public String toString() {
		return "[name=" + name
				+ ", price="
			    + price + ", quantity="
				+ quantity + "]";
	}
	@Override
	public int compareTo(Fruit 과일비교) {
		return this.name.compareTo(과일비교.name); //같은 이름끼리 비교를 하게 되기 때문에
	}
}
