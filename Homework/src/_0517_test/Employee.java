package _0517_test;

public abstract class Employee {

	String no; // ���
	String name; // �̸� 
	int pay; // �޿� 
	
	public Employee(String no, String name, int pay) {
		this.no = no;
		this.name = name;
		this.pay = pay;
	}
	
	public abstract double getMonthPay(); // ���� ��°�
	
	
	//��������
	public void showEmployeeInfo() {
		System.out.println("��� : " + this.no);
		System.out.println("�̸� : " + this.name);
		System.out.println("�ӱ� : " + this.pay);
	}
	
	public void showEmployeePayInfo() {
		System.out.println("getMonthPay : " + getMonthPay());
		
	}
	
}
