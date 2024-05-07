package com.kh.NumberSystem;

public class 숫자시스템 {

	public static void main(String[] args) {
		int num = 42;
		
		//42라는 숫자를 2진수로 변환
	    //정수로 된 숫자 -> 문자열로 변환해서 모두 출력해서 보기위해 String 반환
		String 이진수 = Integer.toBinaryString(num);
		System.out.println(이진수);
	
		//42라는 숫자를 8진수로 변환
		String 팔진수 = Integer.toOctalString(num);
		System.out.println(팔진수);
		
		//42라는 숫자를 -> 2진수로 변환한 값을 가져와서 10진수를 변환
		String 이진수2 = "101010"; //42
		int 십진수 = Integer.parseInt(이진수2,2);
		System.out.println(십진수);
		
		// (2 ~ 16) 진수 -> 십진수 parseInt를 사용해서 변경
		
		//팔진수를 십진수로 변환
		String 팔진수2 = "52";
		/*
		 * 5  		 2 
		 * 5*8¹   8의0승
		 * */
		int 십진수2 = Integer.parseInt(팔진수2,8);
		System.out.println(십진수2); // 42(십진수) = 8진수(팔진수)
		
		//십육진수를 십진수로 변환
		String 십육진수 = "2A";
		int 십진수3 = Integer.parseInt(십육진수,16);
		System.out.println(십진수3);
		//  (2)		 (A)  = 2A
		// 16¹*2 + A(=10) = 42
		
	}
}
