package Day04;

public class CalMinus extends Calculator{

	int chk; //�� 1�� �������� �θ� �� ����ǰ� 
			 // 1�� �ƴҶ� Minus�� ���� 
	
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
		if(chk == 1) {
			return super.calculate(a, b);
		} else {
			return a - b;
		} 
	}
	
	@Override
	public int calculate(int a, int b, int c) {
		return a - b - c;
	}

	
}
