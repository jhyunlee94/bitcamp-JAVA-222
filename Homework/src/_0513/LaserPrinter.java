package _0513;

public class LaserPrinter extends Printer{

	int tonerOfamount; //����ܷ�

	public LaserPrinter() {
		this.modelName = "LG��";
		this.company = "LG";
		this.usbName = "USB";
		this.parallerPort = "2222";
		this.remainingOfPaper = 1;
		this.tonerOfamount = 1;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("��������ͷ� ����Ʈ ���");
		System.out.println("�μ� ���� �ܷ��� : "+ --remainingOfPaper);
		System.out.println("��� �ܷ��� : " + --tonerOfamount);
	
		if(remainingOfPaper <= 0) {
			System.out.println("��������");
		}
	}
	
	
}
