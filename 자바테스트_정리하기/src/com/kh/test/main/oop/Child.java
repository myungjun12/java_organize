package com.kh.test.main.oop;

public class Child extends Parent {
//필드
	int 자식변수;

//메서드
	// 기본 생성자
	public Child() {
		// TODO Auto-generated constructor stub
	}
	
	public Child(int 자식변수) {
		super(); // Parent의 기본 생성자라는 의미
//		super(부모변수); 하나의 자식 생성자에서 super를 두번 부르는건 불가능
		this.자식변수 = 자식변수;
	}
	
	public Child(int 부모변수, int 자식변수) {
		super(부모변수); //Parent에서 필수생성자를 사용하겠다는 의미
		this.자식변수 = 자식변수;
	}

	//만약에 super를 기본생성자와 필수생성자 불러오고 싶다면
	// 		자식 생성자도 두개 만들어서 각각 넣어줘야함
	
	
	
	/*
	 * 필수 생성자 public Child(int 부모변수, int 자식변수) { //super(부모변수); // 부모변수에 어떻게 받아서
	 * 가져가겠다 라는 것이 없기 때문에 뜨는 에러 // 부모변수에도 기본 생성자를 넣어서 작성 this.자식변수 = 자식변수; }
	 */
	public void 자식메서드() {
		super.부모메서드();
		System.out.println("자식도 호출되었습니다.");
	}

}
