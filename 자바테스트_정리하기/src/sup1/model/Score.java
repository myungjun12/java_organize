package sup1.model;

public class Score {
//필드
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
//메서드
	//기본생성자
	public Score() {}
	//필수생성자
	
	//void 점수
	public void result() {
		sum = kor + eng + math;
		avg = sum / 3.0;
		
//		String 결과 = (kor >= 50 && math >= 50 && eng >= 50 && avg )
	}
	
}
