package com.kh.test.main;

public class Test8 {
	public static void main(String[] args) {
		//삼항연산자 익히기
		
		//두 수 중 큰 수 구하기
		 
		int num1 = 10;
		int num2 = 20;
		int large = num1 > num2 ? num1 : num2;
		System.out.println(large);
		
		// 짝수 홀수 
		int num3 = 15;
		String 홀짝 = (num3 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(홀짝);
		
		//성인 미성년자 판별하기
		int age = 18;
		String result = (age > 20) ? "성인" : "미성년자" ;
		System.out.println(result);
		
		//과목 점수에 따라 합격 불합격 판별하기 
		int kor = 80;
		int eng = 75;
		int math = 90;
		String result1 = (kor >= 60 && eng >= 60 && math >= 60) ? "합격" : "불합격" ;
		System.out.println(result1);
		
		//두 수가 서로 같은지 다른지 확인
		int num4 = 10;
		int num5 = 20;
		String result2 = (num4 == num5) ? "같은수" : "다른수" ;
		System.out.println(result2);
	}
}
