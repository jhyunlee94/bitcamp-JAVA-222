package Day03;

public class _06_getterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserInfo userinfo = new UserInfo();
		
		
		//private로 선언된 필드에 직접 접근 불가
		//userinfo.userName = "홍길동"; 
		
		//private로 선언된 필드의 값을 바꿀때는 setter 메소드를 사용
		userinfo.setPhoneNum("02-8888-9999");
		userinfo.setUserAge(17);
		userinfo.setUserName("홍길동");
		
		userinfo.getPhoneNum();
		userinfo.getUserAge();
		userinfo.getUserName();
		
		//private로 선언된 필드 값의 사용은 getter 메소드 사용
		System.out.println("사용자의 이름은 : "+userinfo.getUserName());
		System.out.println("사용자의 연락처는 : "+userinfo.getPhoneNum());
		System.out.println("사용자의 나이는 : "+userinfo.getUserAge());
		
	}

}
