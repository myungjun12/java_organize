package com.kh.test.main;

public class Test2 {

	public static void main(String[] args) {
		for(int dan = 2; dan <= 5; dan++) {
			for(int i = 1; i <= 9; i++) {
				// 홀수 dan 만 통과
				if(dan%2 != 0) {
					// i가 홀수일 때 출력 
					if(i%2 != 0) {
					System.out.println(dan + "X" + i + "=" + dan*i);
					}
				}
			}
		}
	}
}
