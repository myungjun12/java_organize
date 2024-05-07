package com.kh.test.main;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자1 : ");
			int num1 = sc.nextInt();
			if(num1 < 1 || num1 > 9) {
				System.out.println("1 ~ 9의 숫자를 입력해주세요.");
				continue;
			}
			System.out.print("숫자2 : ");
			int num2 = sc.nextInt();
			if(num2 < 1 || num2 > 9) {
				System.out.println("1 ~ 9의 숫자를 입력해주세요.");
				continue;
			}
			System.out.println("계산기 목록 (+),(-),(*),(/),(%),x(종료)");
			System.out.println("보기 중에서 입력");
			char simbol = sc.next().charAt(0);
			int result = 0;
			switch(simbol) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			case 'x':
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			System.out.println(result);
		}
		
	}
}
