package Day04;

public class SportsCar extends Car{

	public SportsCar() {
		
	}
	
	public int driveMode;

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		//driveMode�� 1�� ��� �θ�Ŭ������ drive �޼ҵ� ȣ��
		if(driveMode == 1) {
			//super Ű����� �θ�Ŭ������ �޼ҵ� ȣ��
			//System.out.println("�Ϲ� ����");
			//�ַ� �������̵��� �޼ҵ忡�� �θ�Ŭ������ ���� �޼ҵ带 ����ϰ� ���� �� ���
			super.drive();
		}else {
			System.out.println("��� ����");
		}
	}
}
