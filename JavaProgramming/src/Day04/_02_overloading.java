package Day04;

public class _02_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		
		int result1 = cal.calculate(10, 20);
		System.out.println("결과 값은 : "+result1);
		
		System.out.println("-------------------");
		
		//오버로딩된 메소드 사용
		int result2 = cal.calculate(20, 20, 20);
		System.out.println("결과 값은 : "+result2);
		
		//같은 이름의 메소드이고 매개변수가 다르기에 새롭게 만들수있다 
		// 이게 오버로딩
	}

}
