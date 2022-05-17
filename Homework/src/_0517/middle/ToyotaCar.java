package _0517.middle;

public class ToyotaCar implements ICar{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("도요타차 시동 걸기");
	}

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("도요타차 스피드업");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("도요타차 스피드다운");
	}

	@Override
	public void hitBreak() {
		// TODO Auto-generated method stub
		System.out.println("도요타차 히트브레이커");
	}

}
