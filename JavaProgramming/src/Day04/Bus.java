package Day04;


//Bus는 Vihicle을 상속받았기 때문에
//Bus 형태 이면서 Vihicle의 형태도 가지고 있음
public class Bus extends Vihicle{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다.");
	}

	
}
