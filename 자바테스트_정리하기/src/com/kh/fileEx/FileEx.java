package com.kh.fileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		
		//파일만들고 글 작성하기 
		//파일에 어떠한 경로 설정 없이 만들 때는 
		//무조건 java 코드를 작성하고 있는 폴더 바로 아래에 만들어짐
		//현재는 자바테스트_정리하기라는 폴더 밑에 만들어질 예정
		String fileName = "example.txt";
		
		File file = new File(fileName);
		//파일이 존재하는지 확인 
		if(file.exists()) {
			System.out.println("파일이 이미 존재합니다.");
		}else {
			file.createNewFile();
			System.out.println("파일 생성 완료");
		}
		
		//글 작성하기
		FileWriter 글쓰기 = new FileWriter(file);
		
		글쓰기.write("이것은 파일작성 예시입니다.\n");// \n 줄바꿈
		글쓰기.write("글쓰는 방법을 진행하고 있습니다.\n");
		
		//글을 다 작성했다면 매번 close를 사용해서 닫아주기
		//우리가 어떤 파일을 작성하면서 저장하지 않고 종료할 때
		//저장하시겠습니까? 라는 문구가 뜨면서 저장 취소가 나오는 것처럼
		// close를 사용한다는 것은 저장하기와 같은 의미
		// close를 작성하지 않는다는 것은 글을 작성하다 취소하는 것과 같은 의미
		글쓰기.close();
		System.out.println("파일에 내용을 작성했습니다.");
	}
}
