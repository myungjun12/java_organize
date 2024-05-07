package com.kh.Hamburger;

import java.util.*;

public class BurgerShop {
	
	public static void main(String[] args) {
		//ArrayList를 사용 주문리스트
		List<HamburgerOrder> 주문리스트 = new ArrayList<>();
		주문리스트.add(new HamburgerOrder("동그라미","치즈버거"));
		주문리스트.add(new HamburgerOrder("안세모","베이컨버거"));
		주문리스트.add(new HamburgerOrder("박네모","상하이버거"));
		주문리스트.add(new HamburgerOrder("금각진","치킨버거"));
		주문리스트.add(new HamburgerOrder("동그라미","빅맥"));
		//동그라미, 치즈버거
		//안세모, 베이컨버거
		//박네모, 상하이버거
		//금각진, 치킨버거
		//동그라미, 빅맥
		
		//toString 출력 sout 주문리스트
		for(int i = 0; i < 주문리스트.size(); i++ ) {
			System.out.println(주문리스트.get(i));
		}
		
		//ArrayList에 담긴 중복으로 된 사람들을 중복으로 주문하지 못하게 하고 싶습니다.
		//HashSet
		
		System.out.println("고객님 중복 주문이시네요!!");
		System.out.println("처음 주문만 받겠습니다.^^");
		// Set 중복을 허용하지 않는다.
		Set<String> set = new HashSet<>();
		
		//중복 고객을 제거한 다음에 중복되지 않은 고객만 ArrayList에 다시 담기
		List<HamburgerOrder> 중복제거list = new ArrayList<>();
		
		//for-each문을 활용해서 중복이 있는지 한바퀴 돌면서 확인한다음
		//중복이 되지 않는 내용만 추가
		for(HamburgerOrder 주문: 주문리스트) {
			//존재하는 고객만 추가하겠다 라는 의미이기 때문에 추가가 안됨
			//if(중복고객제거.contains(주문.get고객명())) {
			if(!set.contains(주문.get고객명())) {// HashSet 공간에 주문 고객명이 포함 되지 않는다면 
				중복제거list.add(주문); 		  // 중복제거list(ArrayList)에 추가하겠다 주문값을
				set.add(주문.get고객명());		  // HashSet 공간에 주문고객명 값 추가 
			}								  // for문을 돌다가 set의 고객명과 같은 정보가 있다면
		}									  //  if문은 실행되지 않음으로 중복된 고객명을 제외한 
											  // 주문정보를 중복제거list에 담을 수 있다.
											  // 처음 들어온 중복된 값이 아닌 고객명 값만 보존 
		System.out.println(중복제거list); // 중복제거list에는 처음에 주문한 리스트만 받을 수 있게 됨
	}
}
