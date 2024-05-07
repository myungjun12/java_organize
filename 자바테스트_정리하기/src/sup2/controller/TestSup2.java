package sup2.controller;

import java.util.Scanner;

import sup2.model.Student;

public class TestSup2 {
	public static void main(String[] args) {
		// Scanner 를이용해서 이름 학년 반 번호 성별 성적
		Scanner 스캐너 = new Scanner(System.in);
		System.out.print("이름 : ");
		String 이름 = 스캐너.nextLine();
		System.out.print("학년 : ");
		int 학년 = 스캐너.nextInt();
		System.out.print( "반 : ");
		int 반 = 스캐너.nextInt();
		System.out.print("번호 : ");
		int 번호 = 스캐너.nextInt();
		System.out.print("성별 : ");
		char 성별 = 스캐너.next().charAt(0);
		System.out.print("성적 : ");
		double 성적 = 스캐너.nextDouble();
		Student 학생 = new Student(이름,학년,반,번호,성별,성적);
		학생.정보();
	}

}