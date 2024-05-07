package com.kh.goodshop;

import java.util.*;

public class 컴퓨터가게 {

	public static void main(String[] args) {
		//모든 제품 HashMap
		Map<String, Integer> map = new HashMap<>(); // map.get(키값) = value값 반환
		map.put("노트북", 700000);
		map.put("데스크탑", 20000);
		map.put("모니터", 5000);
		map.put("마우스", 3000);
		map.put("키보드", 2000);
		
		System.out.println("컴퓨터 상품 목록");
		//Entry 사용해서 출력
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			String prudectName = e.getKey();
			int price = e.getValue();
			System.out.println("제품명 : " + prudectName + ", 가격 : " + price);
		}
		
		//특정 물품의 가격 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("찾으시는 상품을 검색하세요 : ");
		String 찾는물건 = sc.nextLine();
		
		System.out.println(찾는물건 + " 가게에 있습니까 ? ");
		
		//containsKey 존해하는지 존재하지 않는지 if문 사용해서 확인 후 
		//존재한다면 네~존재합니다.
		//존재하지 않는다면 현재 품절입니다.
		if(map.containsKey(찾는물건)) {
			int 제품가 = map.get(찾는물건);
			System.out.println("네~ 존재합니다. 가격은 " + 제품가 + "입니다.");
		}else {
			System.out.println("현재 품절입니다.");
		}
			
	}
}
