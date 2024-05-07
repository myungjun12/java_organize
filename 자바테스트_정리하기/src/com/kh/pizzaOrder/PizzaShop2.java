package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.List;

public class PizzaShop2 {

	public static void main(String[] args) {
		//주문목록을 저장할 ArrayList 
		List<PizzaOrder> 주문리스트 = new ArrayList<>();
//		주문리스트.add(new PizzaOrder("고영희","페페로니"));
		PizzaOrder 주문1 = new PizzaOrder("고영희","페페로니");
		PizzaOrder 주문2 = new PizzaOrder("박철진","마르게리따");
		PizzaOrder 주문3 = new PizzaOrder("안영식","슈프림");
		PizzaOrder 주문4 = new PizzaOrder("고영희","파인애플");
		PizzaOrder 주문5 = new PizzaOrder("박철진","치즈");
//		주문리스트.add(주문1); // 필수생성자를 통해 피자 객체를 생성하며 값을 초기화해주고 
						   // 주문리스트에 값이 생성되있는 변수명 대입
		/*
		 위에서 작성한 주문리스트와 
		 밑에서 작성한 주문리스트는
		 주문을 작성한 방식이 다를 뿐이지
		 동일하게 주문을 추가하는 방법
		 주문리스트.add(new PizzaOrder("고영희","페페로니"))
		 * */
		
		주문리스트.add(new PizzaOrder("고영희","페페로니"));
		주문리스트.add(new PizzaOrder("박철진","마르게리따"));
		주문리스트.add(new PizzaOrder("안영식","슈프림"));
		주문리스트.add(new PizzaOrder("고영희","파인애플"));
		주문리스트.add(new PizzaOrder("박철진","치즈"));
		
		/*
		"고영희", "페페로니"
		"박철진", "마르게리따"
		"안영식", "슈프림"
		"고영희", "파인애플"
		"박철진", "치즈"
		 * */
		//HashSet을 사용해서 중복 주문을 방지하기 위한 set / 중복주문방지
		
		//주문추가 PizzaOrder를 사용해서 주문을 추가함

		//주문한 내용 전체 보기 toString 
		System.out.println(주문리스트);
		//1개씩 보고 싶다면 for-each문 사용
		for(PizzaOrder list : 주문리스트) {
			System.out.println(list);
		}
		//중복된 주문 정보 제거한거 출력 
		
	}
}
