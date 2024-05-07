package ncs.test11;

import java.util.Comparator;

//내림차순으로 정렬하는 Comparator<Integer>를 사용 
public class Decending implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
	// 미완성된 메서드 구현해야되서 빨간줄 Decending
	
	/*
	 o1이 o2 보다 작으면 거꾸로 
	 o1이 o2 보다 같으면 0
	 o1이 o2 보다 크면 오름차순		
	  
	 
	 * */
}
