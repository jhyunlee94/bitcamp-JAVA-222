package _0513;

public abstract class PrinterAbstract {

	String modelName; //�𵨸�
	String company; //������ 
	int numberOfPrints; // �μ� �ż�
	int remainingOfPaper; //�μ� ���� �ܷ� 
	String usbName; //USB�̸�
	String parallerPort; //��Ʈ��ȣ
	
	public abstract void print();
}
