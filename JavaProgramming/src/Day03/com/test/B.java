package Day03.com.test;

//public ���� ������
public class B {
	//1. public ���� �����ڷ� ����� ������ �޼ҵ�� ��� Ŭ���������� ���� ���� 
	A a1 = new A(); //������, �ʱ�ȭ
	
	
	//2. default ���� �����ڷ� ����� ������ �޼ҵ��
	// ���� ��Ű������ Ŭ���������� ���ٰ���
	A a2 = new A(1);
	
	//3. private ���� �����ڷ� ����� ������ �޼ҵ��
	// � Ŭ���������� ���� �Ұ���
	//A a3 = new A("str");
	
	

	public B() {
		//4. default ���� �����ڷ� ����� �ʵ�� �޼ҵ��� ������
		// ���� ��Ű������ Ŭ���������� ���� ����
		int n = a1.num1;
		a1.method1();
		
		//5. public ���� �����ڷ� ����� �ʵ�� �޼ҵ��� ������
		// ��� Ŭ���������� ���� ����
		int m = a1.num2;
		a1.method2();
		
		
		//6. private ���� �����ڷ� ����� �ʵ�� �޼ҵ��� ������
		// � Ŭ���������� ���� �Ұ���
		//int k = a1.num3;
		//a1.method3();
	}
	
}