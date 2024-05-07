package com.kh.Sandwich;

import java.util.*;

public class 샌드위치가게 {

	public static void main(String[] args) {
		//주문리스트 ArrayList
		List<샌드위치> list = new ArrayList<>();
		list.add(new 샌드위치("김하나","BLT"));
		list.add(new 샌드위치("이둘","터키"));
		list.add(new 샌드위치("김하나","치킨"));
		list.add(new 샌드위치("이셋","에그마요"));
		list.add(new 샌드위치("김하나","베지터블"));
		
		Set<String> set = new HashSet<>(); // 고객명 추가
		//String인 이유 고객명의 정보만을 추가할 것이기에
		ArrayList<샌드위치> 중복제거된list = new ArrayList<>();
		// 참조타입       
		for(샌드위치 샌드 : list) {// list 객체 정보들 변수명 샌드를 통해 나열
			//마지막에 들어온 값을 중복제거하고 추가한다면 if(!set.Empty()){} 중복허용하지않기에 set.add()해서 추가하면 가능
			
			if(!set.contains(샌드.get고객명())) {//set에 샌드고객명이 포함되지 않는다면
				중복제거된list.add(샌드);// 중복제거된list(ArrayList)에 샌드값 저장및 추가
				set.add(샌드.get고객명());// set에 샌드 고객명 정보 추가
			}
		}
//		System.out.println(중복제거된list);//초기에 들어온 중복되지 않는 고객명을 통해 초기화값준 중복제거된list 출력 
		for(샌드위치 주문 : 중복제거된list) {
			System.out.println(주문);
		}
	}
}
