package Day04;

public class Dog extends Animal{

	Dog(){
		this.kind = "포유류";
	}

	//추상클래스에 존재하는 추상메소드 미구현시 에러발생
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
}
