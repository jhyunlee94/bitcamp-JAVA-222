package _0517.advance;

public abstract class E_test {

	String no;
	String name;
	int pay;
	
	//�߻�Ŭ���� ������ �������� �������� ���⿡ ������ְ� �޴°ɷ�
	E_test(String no, String name, int pay){
		this.no = no;
		this.name = name;
		this.pay = pay;
	}
	
	public abstract double getMonthPay();
	
	public void showEmployeeInfo() {
		System.out.println("��� : " + this.no);
		System.out.println("�̸� : " + this.name);
		System.out.println("�ӱ� : " + this.pay);
	}
	
	public void showMonthPayInfo() {
		System.out.println("monthPay : " + getMonthPay());
		System.out.println("---------------------");
	}
	
	
}
