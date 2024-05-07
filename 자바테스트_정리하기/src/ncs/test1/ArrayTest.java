package ncs.test1;

public class ArrayTest {
	
	public static void main(String[] args) {
		int [][] array = 
		{{12, 41, 36, 56, 21},
		{82, 10, 12, 61, 45},
		{14, 16, 18, 78, 65},
		{45, 26, 72, 23, 34}};

	
	
	//2차원 배열에 들어 있는 데이터들의 합계와 평균을 구한다. 
	double sum = 0;
	int  count = 0;
	
	//for - each 이중으로 작성해서 계산
	
	for(int[] row : array) {//행 1 2 3 4 진행
		
		for(int num : row) {//내려온 1 2 3 4행(배열)을 나열
			sum += num;
			count++; // 더한 횟수 만큼 나누고 평균을 구하기위해
		}
		//평균 계산
		double average = sum / count;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
	 }
   }
}
