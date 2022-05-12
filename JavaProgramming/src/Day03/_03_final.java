package Day03;

public class _03_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car(); // 객체생성
		
		//final 필드인 price 값 변경시 컴파일 오류 
		//car.price=1000;
		
		int a = car.price;
		System.out.println(a);
		System.out.println("차 가격은 : " + car.price);

	
	}

}
