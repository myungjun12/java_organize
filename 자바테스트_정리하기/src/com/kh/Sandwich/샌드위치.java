package com.kh.Sandwich;

public class 샌드위치 {
//필드
	private String 고객명;
	private String 샌드위치타입;
//메서드
	//Setter
	public void set고객명(String 고객명) {
		this.고객명 = 고객명;
	}
	public void set샌드위치타입(String 샌드위치타입) {
		this.샌드위치타입 = 샌드위치타입;
	}
	//Getter
	public String get고객명() {
		return 고객명;
	}
	public String get샌드위치타입() {
		return 샌드위치타입;
	}
	

	//필수 생성자
	public 샌드위치(String 고객명, String 샌드위치타입) {
		super();
		this.고객명 = 고객명;
		this.샌드위치타입 = 샌드위치타입;
	}
	//toString
	@Override
	public String toString() {
		return "샌드위치 [고객명=" + 고객명 + ", 샌드위치타입=" + 샌드위치타입 + "]";
	}
	
}
