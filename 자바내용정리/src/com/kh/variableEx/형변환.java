package com.kh.variableEx;
/*
 (자료)형변환
 	데이터 타입을 변환하는 것 
 	변환에는 자동으로 변환하는 형변환 
 			강제로 변환하는 형변환
 			
	자동으로 형변환이 가능한 경우는 byte가 서로 같거나 
		변환하는 결과가 변환 전 byte보다 클 경우 자동으로 형변환 가능
	큰 byte에서 작은 byte로 넘어갈 때는 큰 그릇에서 작은 그릇으로 
	이동하기 때문에 강제로 넣어줘야 함 (강제로 넣을 경우 데이터 손실 발생 가능성 있음)
	
	자동형변환 ()를 생략해도 되고 생략하지 않아도 됨
		예시
			int 숫자 = 10;
			double 실수 = (double) 10; // (double) 생략되도 가능
			
	강제형변환 ()를 무조건 넣어줘야함
		예시
			double 실수 = 1.0;
			int 숫자 = (int) 실수; // (int)를 필수로 작성
	
	****** 메서드 호출을 통한 형변환 ****** 
	String → 숫자자료형 
	***	객체자료형.parse자료형(변환할 문자열 변수); *** 이정돈 외우자
		Integer.parseInt(변환할 String 변수);
		Byte.parseByte();
		Short.parseShort();
		Long.parseLong();
		Float.parseFloat();
		Double.parseDouble();
	**********************************
	숫자자료형 → String /변환할 때[정수 맨 앞에 0이 있다면 자동으로 제거시킨 후 진행]
	*** 객체자료형.toString(변환할 숫자 변수); ***
		Integer.toString(변환할 숫자 변수);
		Byte.toString();
		Short.toString();
		Long.toString();
		Float.toString();
		Double.toString();
	**********************************
		일부 데이터들은 메서드를 통해 값 변환이 진행됨
		
		문자열 String으로 담은 값을 숫자계열로 변경하고 싶을 때 많이 사용
		
		예를 들어 문자열을 정수로 변환하길 원한다면 
		String 핸드폰번호 = "01012345678";
		Integer.parseInt(핸드폰번호); // 숫자로 변경
		
 * */
public class 형변환 {

}
