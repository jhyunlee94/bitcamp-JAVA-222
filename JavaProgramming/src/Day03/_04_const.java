package Day03;

public class _04_const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//상수도 final로 만들어지기때문에 수정을 불가능함 수정할려하면 컴파일에러가 발생
		//상수도 final 키워드를 이용하여 선언되기 때문에 값의 변경이 불가능
		//Earth.EARTH_AREA = 6000;
		
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS +"km" );
		System.out.println("지구의 면적 : " + Earth.EARTH_AREA +"km^2");
		
		
		
	}

}
