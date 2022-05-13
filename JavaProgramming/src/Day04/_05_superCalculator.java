package Day04;

public class _05_superCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalMinus calMinus = new CalMinus();
		
		
		// chk == 1 부모 클래스인 Calculator 의 calculate 메소드가 호출되어 덧셈의 결과
		// chk == 2 자식 클래스인 CalMinus의 메소드가 실행되어 뺄셈의 결과
		
		
		calMinus.chk = 1;
		int result = calMinus.calculate(10, 5);
		
		System.out.println(calMinus.chk);
		System.out.println(result);
		
		
		System.out.println("----------");
		
		
		calMinus.chk = 2;
		int result1 = calMinus.calculate(10, 5);
		
		System.out.println(calMinus.chk);
		System.out.println(result1);
	}

}
