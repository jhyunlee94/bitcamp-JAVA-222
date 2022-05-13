package Day04;

public class SportsCar extends Car{

	public SportsCar() {
		
	}
	
	public int driveMode;

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		//driveMode가 1일 경우 부모클래스의 drive 메소드 호출
		if(driveMode == 1) {
			//super 키워드로 부모클래스의 메소드 호출
			//System.out.println("일반 주행");
			//주로 오버라이딩된 메소드에서 부모클래스의 원본 메소드를 사용하고 싶을 때 사용
			super.drive();
		}else {
			System.out.println("고속 주행");
		}
	}
}
