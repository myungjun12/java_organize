package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {
	
	public static void main(String[] args) {
		//현재 날짜 시간
		Date now = new Date();
		System.out.println(now);
		//Fri May 03 10:29:59 KST 2024
		//우리가 원하는 형식으로 변경 SimpleDateFormat 사용해서 변경
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//now로 받은 날짜를 문자열로 simpleDateFormat을 사용해서 변경
		String formatDate = sdf.format(now);
		System.out.println("날짜형식변경 : " + formatDate);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
		String formatDate1 = sdf2.format(now);
		System.out.println(formatDate1);
		
		//문자열(SimpleDateFormat → String)을 날짜(Date)로 변경
		String 문자열 = "2024-04-30 15:30:45";
		
		try {
			Date parseDate = sdf.parse(문자열);
			System.out.println(parseDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Date로 변경할 때 문제가 생길 수 있으니 try-catch 사용하라는 뜻
	}
}
