package Day03;

public class _07_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String com, int pri, int si, String a
		
		//sTv�� TvŬ������ ��ӹ޾Ƽ� TvŬ������ �ʵ�� �޼ҵ带 �����ϴ� ���·� ������
		SamsungTv sTv = new SamsungTv("�Ｚ",300000, 47, "�򽺺�");
		LgTv lTv = new LgTv("LG",250000, 52, "���� ��ý��Ͻ�");
		
		//��ӹ��� �θ� �ʵ忡 ����
		System.out.println("�� Ƽ���� ������� : "+sTv.company);
		System.out.println("�� Ƽ���� ������ : "+sTv.price);
		System.out.println("�� Ƽ���� ������� : "+sTv.size);
		
		//�ڽ� Ŭ������ ���� �ʵ� ���
		System.out.println("�� Ƽ���� �ΰ������� : "+sTv.ai);
		
		//��ӹ��� �θ� Ŭ������ �޼ҵ� ����
		sTv.powerOn();
		sTv.powerOff();
		
		//�ڽ�Ŭ������ ���� �޼ҵ� ���
		sTv.turnOnAi();
	}

}
