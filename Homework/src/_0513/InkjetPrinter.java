package _0513;

public class InkjetPrinter extends Printer{

	int inkOfamount; //��ũ�ܷ�
//	int cnt; // �ܷ� �پ��°� ó����?? 
	
	 InkjetPrinter() {
		this.modelName = "�Ｚ��";
		this.company = "�Ｚ";
		this.usbName = "USB";
		this.parallerPort = "1111";
		this.remainingOfPaper = 100;
		this.inkOfamount = 100;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("��ũ�������ͷ� ����Ʈ ���");
		System.out.println("�μ� ���� �ܷ��� : "+ --remainingOfPaper);
		System.out.println("��ũ �ܷ��� : " + --inkOfamount);
	
		if(remainingOfPaper <= 0) {
			System.out.println("��������");
		}
	}
	
	
}
