package com.kh.test.main;

public class Test7 {

	public static void main(String[] args) {
		// 배열 안 홀수의 값 출력하고 합 구함
		// continue 사용
		
		int[] Arr = {1,2,3,4,5,6,7,8,9,10};
		double arrSum = 0;
		for(int a: Arr) {
			if(a % 2 != 0) {
			System.out.print(a + " ");
				arrSum += a;
			}
		}
		System.out.println();
		System.out.println(arrSum);
	}
}
