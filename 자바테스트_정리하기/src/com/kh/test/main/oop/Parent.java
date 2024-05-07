package com.kh.test.main.oop;
//Parent 부모님
public class Parent {
//필드
	int 부모변수;
	
//메서드
	
	//기본 생성자
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	
	//필수 생성자
	public Parent(int 부모변수) {
		super();
		this.부모변수 = 부모변수;
	}
	
	public void 부모메서드() {
		System.out.println("부모님이 등장했습니다.");
	}
	
}
