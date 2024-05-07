package com.kh.test.main;

import java.util.ArrayList;
import java.util.Arrays;

public class 리스트예제 {

	public static void main(String[] args) {
		//ArrayList 생성 
		String[] str = {"가","지","마","라","고"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
		//값추가 
		list.add("했지");
		String s = list.set(0, "오");
		System.out.println(s);
		System.out.println(list);
		String sr = list.remove(0);
//		list.remove("오");
		System.out.println(sr);
		System.out.println(list);
		list.add(0,"바");
		//*** index 순서대로 추가안하면 자리값 맞지 않는다는 오류뜸 ***
		//크기 확인
		System.out.println(list.size());
		//포함여부 확인
		System.out.println(list.contains("라"));
		//index 확인
		System.out.println(list.indexOf("마")); // 해당되는 값이 list에 있다면 index 위치 반환
	}
}
