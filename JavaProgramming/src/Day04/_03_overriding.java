package Day04;

public class _03_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();

		System.out.println("부모 클래스 메소드 사용 결과");
		int result1 = cal.calculate(10, 5);
		System.out.println(result1);
		
		System.out.println("---------------");
	
		int result2 = cal.calculate(20, 5, 5);
		System.out.println(result2);
	
		
		System.out.println("---------------");
		int result3 = cal.calculate(5,10);
		System.out.println(result3);
		

		CalMinus calMinus = new CalMinus();
		
		System.out.println("자식 클래스 메소드 사용 결과");
		int result4 = calMinus.calculate(10, 5);
		System.out.println(result4);
		
		System.out.println("---------------");
	
		int result5 = calMinus.calculate(20, 5, 5);
		System.out.println(result5);
	
		
		System.out.println("---------------");
		int result6 = calMinus.calculate(5,10);
		System.out.println(result6);
		
		
		
		
	}
}
