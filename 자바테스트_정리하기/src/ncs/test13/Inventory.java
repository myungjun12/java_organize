package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Inventory {
//필드
	private String productName;		 //상품명
	private   Date putDate; 		 //입고일
	private   Date getDate; 		 //출고일
	private    int putAmount;		 //입고수량
	private    int getAmount; 		 //출고수량
	private    int inventoryAmount;  //재고수량
//메서드
	//기본 생성자
	public Inventory() {}
	//필수 생성자
public Inventory(String productName, Date putDate, int putAmount) {
	this.productName = productName;
	this.putDate = putDate;
	this.putAmount = putAmount;
}
	//Setter
public void setProductName(String productName) {
	this.productName = productName;
}
public void setPutDate(Date putDate) {
	this.putDate = putDate;
}
public void setGetDate(Date getDate) {
	this.getDate = getDate;
}
public void setPutAmount(int putAmount) {
	this.putAmount = putAmount;
}
public void setGetAmount(int getAmount) {
	this.getAmount = getAmount;
}
public void setInventoryAmount(int inventoryAmount) {
	this.inventoryAmount = inventoryAmount;
}
	//Getter
public String getProductName() {
	return productName;
}
public Date getPutDate() {
	return putDate;
}
public Date getGetDate() {
	return getDate;
}
public int getPutAmount() {
	return putAmount;
}
public int getGetAmount() {
	return getAmount;
}
public int getInventoryAmount() {
	return inventoryAmount;
}
	//toString
@Override
public String toString() {
	
	//날짜 형식을 변경
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
	
	String 문자열변환 = dateFormat.format(putDate);
	
	String 출고일변환 = dateFormat.format(getDate);
			  //   입고수량  -  판매량
	int 남은재고 = putAmount - getAmount;
	
	return "Inventory [제품명=" + productName 
			+ ", 입고일=" + 문자열변환
			+ ", 출고일=" + 출고일변환
			+ ", 상품재고=" + putAmount
			+ ", 판매량=" + getAmount
			+ ", 팔고 남은 양=" + inventoryAmount + "]";
}
	
}
