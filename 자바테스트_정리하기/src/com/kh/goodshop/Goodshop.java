package com.kh.goodshop;

import java.util.*;

public class Goodshop {

	public static void main(String[] args) {
		Map<String, Integer> item = new HashMap<>();
		
		System.out.println("어서오세요. 제주에 오신 것을 환영합니다.^^");
		
		//물품과 가격 추가
		item.put("동백모자", 20000);
		item.put("감귤모자", 15000);
		item.put("흑돼지키링", 25000);
		
		//물품 목록 보기 Map.Entry
		//	Map<String, Integer> = Map.Entry<안에 들어있는 타입이 Map과 동일해야함>
										//item 정보 키-값 모두 보기
		for(Map.Entry<String, Integer> e : item.entrySet()) {
			String product = e.getKey(); // 제품명만 가져옴
			int price = e.getValue(); // 제품 가격만 가져옴
			System.out.println(product + "은 " + price + "원 입니다.");
		}
		
		//특정 물품의 가격보기
		System.out.println("저기요~! 이거 얼마인가요~!");
		String 제품명 = "오미자볼펜";
		//오미자 볼펜이 있는지 확인하고 얼마인지 얘기함
		//내가 가진 아이템에서 손님이 찾는 제품이 있는지 확인/ 판매하기 위해
		if(item.containsKey(제품명)) {//오미자볼펜을 검색했을때 존재하면 정보 가져오기
			int 제품가격 = item.get(제품명);//item.get(key값)은 key값의 value값을 반환함
			System.out.println(제품명 + "의 가격은 " + 제품가격 + "원");
		}else {
			System.out.println(제품명 + " 은(는) 전시용으로 판매하는 상품이 아닙니다." );
		}
	}
}
