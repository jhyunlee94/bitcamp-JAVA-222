package Day04;

public class CalMinus extends Calculator{

	//�θ� Ŭ������ �����ϴ� �޼ҵ带 ������
	//�θ� ũ������ �����ϴ� �޼ҵ�� ���°� ���� ����
	//�̸��� ���� �Ű����� Ÿ�԰�, ���°� �����ؾ��Ѵ�.
	//�ڽ� Ŭ�������� ���Ӱ� �������ϴ°� �������̵��̶���Ѵ�.
	@Override 
	// ������̼� : � Ŭ������ �޼ҵ�, �Ǵ� �ʵ尡
	// 			 � ������ �ϴ��� ���� �����Ϸ��� �˷���
	// 			 ������ �ӵ� ���
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}
	
	@Override
	public int calculate(int a, int b, int c) {
		return a - b - c;
	}



	
}
