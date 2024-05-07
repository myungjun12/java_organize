package pre.propertiesEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PropTest {
	
	public static void fileSave(Properties p) {
		//Properties에 XML 파일로 내용 저장하기
		p.setProperty("1", "패밀리맨,4,2000");
		p.setProperty("2", "엘리멘탈,5,2023");
		p.setProperty("3", "투모로우,5,2004");
		
		try {
		
			FileOutputStream fos = new FileOutputStream("movies.xml");
			p.storeToXML(fos, null);
			fos.close();//파일 저장 후 종료
			
			System.out.println("설정이 movies.xml 파일에 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//fileOpen xml 파일에 있는 내용 출력
		public static void fileOpen(Properties p) {
//			try {
//				
//				FileInputStream fis = new FileInputStream("movies.xml");
//				p.loadFromXML(fis);
//				fis.close();
//				
//				List<Movies> movies = new ArrayList<>();
//				for(String key : p.stringPropertyNames()) {
//					String[] values = p.getProperty(key).split(",");//getProperty /Map과 비슷하게 get키값 = value 값 ,기준 나눠서 String배열에 담아줌
////					String name = value[0] 
//////					int score = value[1]
//////					int people = value[2]
////					values[1]
////					values[2]
////				}
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	
	
		public static void main(String[] args) {
			Properties p = new Properties();
			fileSave(p);
	}
}
