package Day04;

public class _05_superCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalMinus calMinus = new CalMinus();
		
		
		// chk == 1 �θ� Ŭ������ Calculator �� calculate �޼ҵ尡 ȣ��Ǿ� ������ ���
		// chk == 2 �ڽ� Ŭ������ CalMinus�� �޼ҵ尡 ����Ǿ� ������ ���
		
		
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
