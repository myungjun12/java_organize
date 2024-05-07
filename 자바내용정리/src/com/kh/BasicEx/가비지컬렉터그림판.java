package com.kh.BasicEx;

public class 가비지컬렉터그림판 {

	public static void main(String[] args) {
		String phoneNumber = "010"; // 가비지컬렉션에 의해 Heap에서 사라짐
		System.out.println(phoneNumber);// 가비지컬렉션에 의해 Heap에서 사라짐
		
		phoneNumber += "-1234-5678";
		System.out.println(phoneNumber);
	}
}
