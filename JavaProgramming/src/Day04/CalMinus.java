package Day04;

public class CalMinus extends Calculator{

	//부모 클래스에 존재하는 메소드를 재정의
	//부모 크래스에 존재하는 메소드와 형태가 완전 동일
	//이름도 같고 매개변수 타입과, 형태가 동일해야한다.
	//자식 클래스에서 새롭게 재정의하는게 오버라이딩이라고한다.
	@Override 
	// 어노테이션 : 어떤 클래스나 메소드, 또는 필드가
	// 			 어떤 역할을 하는지 등을 컴파일러에 알려줌
	// 			 컴파일 속도 향상
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}
	
	@Override
	public int calculate(int a, int b, int c) {
		return a - b - c;
	}



	
}
