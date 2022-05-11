package Day02;

public class _06_useOfTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 객체의 생성과 초기화
//		Tv tv = new Tv();
		Tv tv = new Tv("Apple", 200);
		
		//생성된 객체의 속성이나 메소드에 접근할 때는
		//생성된 객체 명. 접근 할 수 있다.
		//2. 객체 속성 값 사용
		System.out.println("TV의 제조사는 "+ tv.company +"입니다. ");
		System.out.println("TV의 가격은 "+ tv.price +"원 입니다. ");
		
		//3. 객체 메소드(동작) 실행 
		
		tv.turnOn();
		tv.changChannel();
//		tv.changeVolumn();
		tv.volumnUp();
		tv.volumnDown();
		tv.turnOff();
	}

}
