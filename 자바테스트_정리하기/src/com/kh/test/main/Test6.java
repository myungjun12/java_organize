package com.kh.test.main;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 선택 : ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("입력이 정상적으로 되었습니다.");
			break;
		case 2:
			System.out.println("조회가 시작되었습니다.");
			break;
		case 3:
			System.out.println("수정이 정상적으로 되었습니다.");
			break;
		case 4:
			System.out.println("삭제가 정사적으로 되었습니다.");
			break;
		case 5:
			System.out.println("정상적으로 종료되었습니다.");
			return;
		default:
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		}
		
	}
}
