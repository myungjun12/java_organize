package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre2 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		//Fri May 03 11:28:53 KST 2024
		//날짜 형식 0000년 00월 00일
		//년 월 일 형식으로 글자를 넣게 되면 자동으로 시 분 초는 값을 읽어오지 못함
		//Fri May 03 00:00:00 KST 2024
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일EEEE");
			
		//날짜를 문자열로 format 형식
			String formatDate = sdf.format(now);
			//출력
			System.out.println(formatDate);
		
			 try {
				Date parseDate = sdf.parse(formatDate);
				System.out.println(parseDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
		//문자열을 날짜로 parse를 사용해서 변경
	}
}
