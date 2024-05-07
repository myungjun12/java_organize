package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
				System.out.println("2의 배수인지 아닌지 확인합니다.");
				System.out.print("정수 입력 : ");
				int num = sc.nextInt();
				sc.nextLine();
				
				if(num > 0 && num <= 100) {
					if(num%2 == 0) {
						System.out.println("2의 배수인 num값 : " + num);
						break;
					}else {
						System.out.println(num + "은 2의 배수가 아닙니다.");
						break;
					}
				}else {
					System.out.println("1 ~ 100 사이의 정수를 입력해주세요.");
				}
			}//while
			System.out.println("=== if  else if  else");
			int num1 = 5;
			
			if(num1 > 0) {
				System.out.println("양수입니다.");
			}else if(num1 < 0) {
				System.out.println("음수입니다.");
			}else {
				System.out.println("0입니다.");
			}
		}
	}