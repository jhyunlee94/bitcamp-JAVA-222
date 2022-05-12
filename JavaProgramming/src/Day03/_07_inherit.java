package Day03;

public class _07_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String com, int pri, int si, String a
		
		//sTv가 Tv클래스를 상속받아서 Tv클래스의 필드와 메소드를 포함하는 형태로 생성됨
		SamsungTv sTv = new SamsungTv("삼성",300000, 47, "빅스비");
		LgTv lTv = new LgTv("LG",250000, 52, "구글 어시스턴스");
		
		//상속받은 부모 필드에 접근
		System.out.println("이 티비의 제조사는 : "+sTv.company);
		System.out.println("이 티비의 가격은 : "+sTv.price);
		System.out.println("이 티비의 사이즈는 : "+sTv.size);
		
		//자식 클래스의 고유 필드 사용
		System.out.println("이 티비의 인공지능은 : "+sTv.ai);
		
		//상속받은 부모 클래스의 메소드 접근
		sTv.powerOn();
		sTv.powerOff();
		
		//자식클래스의 고유 메소드 사용
		sTv.turnOnAi();
	}

}
