package 자바_예제문제실습;

import java.io.FileWriter;
import java.io.IOException;

public class FileMain {

	public static void main(String[] args) {
	
		try {
			
			FileWriter fw = new FileWriter("Animal.txt",true);
			fw.write("얼룩말 뒷차기\n");
			fw.write("효과는 굉장했다");
			fw.flush();
			fw.close();
			System.out.println("파일이 성공적으로 저장 되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
