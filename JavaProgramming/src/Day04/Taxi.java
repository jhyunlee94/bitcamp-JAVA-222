package Day04;

//Taxi는 Vihicle을 상속받았기 때문에
//Taxi 형태 이면서 Vihicle의 형태도 가지고 있음
public class Taxi extends Vihicle {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("택시가 달립니다.");
	}

	
}
