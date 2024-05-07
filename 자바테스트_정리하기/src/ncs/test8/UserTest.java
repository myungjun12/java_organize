package ncs.test8;

public class UserTest {

	public static void main(String[] args) {
		//User 객체를 담을 수 있는 배열 선언
		User[] users = new User[3];
		
		//3개의 User 객체 생성해서 배열에 넣기 
		users[0] = new User("user01","비번1","김철수",32,'M',"010-1234-5678");
		users[1] = new User("user02","비번2","이영희",25,'F',"010-5555-7777");
		users[2] = new User("user03","비번3","황진희",20,'F',"010-9874-5632");
		for(User u : users) {
			System.out.println(u.toString());
		}
		
		//내가 만든 유저 정보를 그대로 복사해서 복사가 잘 되었는지 출력
		User[] 유저복사 = new User[users.length];
		for(int i = 0; i < users.length; i++) {
			유저복사[i] = users[i].clone(); // users 복사
			System.out.println(유저복사[i].toString());
		}
	}
}
