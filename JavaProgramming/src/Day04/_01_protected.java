package Day04;

public class _01_protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SamsungTv sTv = new SamsungTv();
		
		System.out.println("---------------------");
		
		//protected�� ����� �ʵ峪 �޼ҵ��
		//���� ��Ű������ Ŭ�������� ��밡��
		//���� ��Ű������ Ŭ������ ��ӹ��� �ڽ� Ŭ�������� 
		//����� �� �ִ� �ʵ峪 �޼ҵ带 ������ �� ���
		Tv tv = new Tv();
		tv.company = "������ ����";
		System.out.println(tv.company);
	}

}
