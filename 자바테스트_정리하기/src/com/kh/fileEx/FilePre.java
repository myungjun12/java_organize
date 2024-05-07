package com.kh.fileEx;

import java.io.*;

public class FilePre {

	public static void main(String[] args) throws IOException {
		String fileName = "practice.txt";
		File file = new File(fileName);
		//파일이 존재하는지 확인 exists()
		if(file.exists()) {
			System.out.println("기존 파일이 존재합니다.");
		}else {
			file.createNewFile();
			System.out.println("파일 생성 완료");
		}
		
		//파일에 글을 작성하기 FileWriter write()
		FileWriter fw = new FileWriter(file);
		
		fw.write("Java C+ C++ C# 자바스크립트\n");
		fw.write("File\n");
		fw.write("객체\n");
		fw.write("종료하기\n");
		fw.close();
	
		System.out.println("글쓰기 종료");
		//Java \n File \n 객체 \n 종료하기 실행
	}
}
