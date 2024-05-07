package nc.test5;

public class Book {
//필드
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
//메서드
	//Getter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	//기본 생성자
	public Book() {}
	//필수 생성자
	public Book(String title, String author, int price, String publisher, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}
	//할인율
	public int get할인가() {
		//
		double discountAmount = price * discountRate;
		
		int 할인가격 = (int)(price - discountAmount);
		return 할인가격;
	}
	//toString 
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher
				+ ", discountRate=" + discountRate + "]";
	}
}
