package Day04;

public abstract class Animal {

	public String kind; // ����� �ʵ�
	
	public void breath() {
		System.out.println("���� ���ϴ�.");
	}
	
	// �߻�޼ҵ� ���� // �ڽĵ��� �������� ����ϴ� �޼ҵ��ΰ���
	// �ڽİ�ü������ ������ �ٸ� �� 
	// �ڽİ�ü���� ���� ����
	public abstract void sound();
	
}
