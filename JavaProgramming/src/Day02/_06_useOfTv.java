package Day02;

public class _06_useOfTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. ��ü�� ������ �ʱ�ȭ
		Tv tv = new Tv();
		
		//������ ��ü�� �Ӽ��̳� �޼ҵ忡 ������ ����
		//������ ��ü ��. ���� �� �� �ִ�.
		//2. ��ü �Ӽ� �� ���
		System.out.println("TV�� ������� "+ tv.company +"�Դϴ�. ");
		System.out.println("TV�� ������ "+ tv.price +"�Դϴ�. ");
		
		//3. ��ü �޼ҵ�(����) ���� 
		
		tv.turnOn();
		tv.changChannel();
		tv.changeVolumn();
		tv.turnOff();
	}

}
