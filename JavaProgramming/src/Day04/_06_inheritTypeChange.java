package Day04;

public class _06_inheritTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. �ڽİ�ü ����
		//SmartPhone �����̸鼭 Phone�� ���µ� ������ ����
		//price, showPrice, size, showSize ����������
		SmartPhone smartPhone = new SmartPhone();
		
		
		
		//2. �θ�ü�� �ڽİ�ü ����
		//�ڽİ�ü�� �θ�ü�� ���µ� ��� �ֱ� ������
		//�θ�ü�� ���·� ����ȯ�� �߻��Ͽ� �θ� ��ü�� ���·� ��� ����
		Phone phone = (Phone) smartPhone;
		
		//3. �� ��ȯ�� �θ�ü�� ���
		//�θ�ü�� �� ��ȯ�Ǿ��� ������ �ڽİ�ü�� ����� ��� �Ұ���
		phone.showPrice();
//		phone.showSize(); //�̰Ŵ� ����� �Ұ��� 
		
		System.out.println("------------");
		//�ڽİ�ü�� �ڽİ�ü �״�� ��� ����
		smartPhone.showSize();
		
	}

}
