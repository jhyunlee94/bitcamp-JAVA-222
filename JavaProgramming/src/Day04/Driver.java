package Day04;

public class Driver {

	//1. �Ű������� �θ�ü�� �����ϹǷμ� 
	//	 �پ��� �ڽİ�ü���� �Ű������� ���� �� �ְ� �ǰ�
	// 	 �Ű������� ���� �ڽİ�ü�鿡 ���� ������� �޶���
	// bus�� Vihicle���·� ����ȯ
	// �Ű������� Vihicle��ü ����
	//Bus, Taxi�� �ᱹ
	//�Ű������� Vihicle�� ���¸� ������ �ִ� ��ü�� ��� ����
	// Vihicle, Bus, Taxi
	// �������� ������ ����������� �̷����ϴ°̴ϴ�.
	
	public void drive(Vihicle vihicle) {
		vihicle.run();
	}
	
	// Vihicle �� �����ν� 
	// bus�� taxi �� vihile �� ������ �ֱ⶧���� 
	// ȣ���Ҽ��ִ°Ŵ�
	
	
	
	//�����ε��� �þ�� �������� �̷���� ���⶧����
	//�� �Ű������� �θ� ��ü�� �޾Ƽ� ������, �ýð� �� ����Ҽ��ְ��ϴ°Ŵ�.
//	public void drive(Bus bus) {
//		bus.run();
//	}
//	
//	public void drive(Taxi taxi) {
//		taxi.run();
//	}
	
	//����
	//add �Լ��� ȣ���ϸ��� ������ ���� �ΰ��� �޾Ƽ� 
	//�� �޼ҵ忡 �־��ִ°ſ���
	public int add(int a, int b) {
		return a + b;
	}
	
}
