package Day04;

public class _02_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		
		int result1 = cal.calculate(10, 20);
		System.out.println("��� ���� : "+result1);
		
		System.out.println("-------------------");
		
		//�����ε��� �޼ҵ� ���
		int result2 = cal.calculate(20, 20, 20);
		System.out.println("��� ���� : "+result2);
		
		//���� �̸��� �޼ҵ��̰� �Ű������� �ٸ��⿡ ���Ӱ� ������ִ� 
		// �̰� �����ε�
	}

}