package com.kh.test.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 정규표현식 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한글을 입력하세요 : ");
		String input = sc.nextLine();
		
		//예를 들어서 반복하는 패턴이 가-힣 한글이라면
		if(Pattern.matches("^[가-힣]*$", input)) {
			System.out.println("입력한 문자열은 한글입니다.");
		}else {
			System.out.println("한글만 입력해주세요.");
		}
		
		//전화번호 0-9 입력하는 스캐너 진행해보기 
		
		System.out.println("전화번호를 (-) 없이 입력하세요.");
		String 전화번호 = sc.nextLine();
					
		if(Pattern.matches("^[0-9]*$", 전화번호)) {
			System.out.println("입력한 문자열은 전화번호 형식입니다.");
			// 숫자로 입력받고 싶다면 Integer.parseInt(전화번호); -> 숫자로 변경 
		}else {
			System.out.println("전화번호 형식이 아닙니다.");
		}
	}
}
