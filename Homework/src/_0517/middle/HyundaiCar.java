package _0517.middle;

public class HyundaiCar implements ICar{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("현대차 시동 걸기");
	}

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("현대차 스피드업");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("현대차 스피드다운");
	}

	@Override
	public void hitBreak() {
		// TODO Auto-generated method stub
		System.out.println("현대차 히트브레이커");
	}

}
