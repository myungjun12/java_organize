package ncs.test2;

public class StringTest {

	public static void main(String[] args) {
		/*
	 주어진 String 데이터를 “,”로 나누어 5개의 실수 데이터들을 꺼내어 합과 평균을 구한다. 
	단, String 문자열의 모든 실수 데이터를 배열로 만들어 계산한다.
		 * */
		String str = "1.22, 4.12, 5.93, 8.71, 9.34";
		
		//문자열을, 기준으로 나눠서 배열로 만들어서 담아줌
						//split 나눈다 ((,)기준으로) 
		String[] numbers = str.split(",");
		
		//, 나눈 실수들을 모아서 double에 담아줌
		double[] values = new double[numbers.length];
		// numbers에서 나눠 담은 배열의 크기만큼 크기생성
		
		//문자열로 담겨진 배열을 실수로 변환하는 형변환
		for(int i = 0; i < numbers.length; i++) {
			 // 문자열을 실수로 변환하는데 사용하는 메서드
			values[i] = Double.parseDouble(numbers[i]);
			System.out.println("values[" + i + "]" + values[i]);
		}
		
		double sum = 0;
		for(double num : values) {
			sum += num;
		}
		//평균 구하기
		double avg = sum / values.length;
		//출력
		System.out.println("원래 주어진 값 : " + str);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
