package _0517.advance;

public abstract class Employee {
	String no;
	String name;
	int pay;
	
	//�߻�Ŭ������ �����ڸ� ����� ����
	//�߻�޼���
	public abstract double getMonthPay();
	
	public Employee(String no, String name, int pay) {
		this.no = no;
		this.name = name;
		this.pay = pay;
	}
	
	//�Ϲݸ޼���
	public void showEmployeeInfo() {
		System.out.println("��� : " + this.no);
		System.out.println("�̸� : " + this.name);
		System.out.println("�ӱ� : " + this.pay);
	}
	/**
	 * ������� + �������� ����ϴ� ���
	 */
	public void showMonthPayInfo() {
		showEmployeeInfo();
		System.out.println("monthPay: " + getMonthPay());
		System.out.println("-----------------------");
	}
}
