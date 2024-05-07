package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		//Date로 현재 날짜를 받아서 년-월-일 출력하기
		Date now = new Date();
		System.out.println(now);
		System.out.println("============================");
		//SimpleDateFormat 
		//년월일										//년월일시분초 출력정보 입력
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String formatDate1 = sdf1.format(now);
		System.out.println(formatDate1);
		System.out.println("============================");
		
		//문자열(SimpleDateFormat - String) → 날짜(Date) 변경
				//Date parseDate2
		String 문자열1 = "2002-08-08 12:00:30";
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date parseDate = sdf4.parse(문자열1);
			System.out.println(parseDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("============================");
		//시:분:초
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String formatDate2 = sdf2.format(now);
		System.out.println(formatDate2);
		System.out.println("============================");
		String 날짜문자열 = "2024-03-28";
		//문자열(SimpleDateFormat - String) → 날짜(Date) 변경
		  try {
			Date parseDate4 = sdf2.parse(날짜문자열);
			System.out.println(parseDate4);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//전체출력
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = sdf3.format(now);
		System.out.println(formatDate);
	}
}
