package 자바_예제문제실습;

import java.io.*;

public class PersonMain {
	
	public static void main(String[] args) {
		
		PersonMain 사람메인파일만들기 = new PersonMain();
		
		사람메인파일만들기.fileSave("김영희씨인적사항.txt");
	}

	public void fileSave(String 파일이름) {
		File file = new File(파일이름);
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			Person 사람 = new Person("김영희",10);
			bw.write(사람.toString());
			bw.flush();
			bw.close();
			System.out.println("파일이 성공적으로 저장되었습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
