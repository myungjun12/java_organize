package com.kh.test.main;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		//while문을 사용해서 switch문
		// case 3: 종료 만들어주기
		//while에 true 대신에 true가 담겨져 있는 변수를 하나 만들어주고
		//변수값을 true -> false로 만들어준 후 종료시키기
		
		//switch case문 실행
		Scanner sc = new Scanner(System.in);
		boolean playing = true;
	while(playing) {
			System.out.print("숫자 작성");
			int day = sc.nextInt();
			String play;
			switch(day) {
			case 1:
				play = "월요일 : 업무";
				break;
			case 2:
				play = "화요일 : JAVA";
				break;
			case 3:
				play = "프로그램을 종료합니다.";
				playing = false;
				break;
			default:
				play = "휴식";
				break;
			}
			System.out.println("일정 : " + play);
		}
	
	int firstNum = 1; // 시작 숫자
	int sumNumber = 0; // 숫자들의 총합
	int count = 0; // 반복횟수 확인
	while(firstNum <= 100) {
		count++;
		sumNumber += firstNum;
		firstNum++;
	}
	double average = sumNumber / count;
	System.out.println("1~ 100까지의 합 : " + sumNumber);
	System.out.println("while문 수행된 횟수 : " + count);
	System.out.println("총합 평균 : " + average);
	}
}
