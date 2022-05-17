package _0517_test;

public abstract class Employee {

	String no; // 사번
	String name; // 이름 
	int pay; // 급여 
	
	public Employee(String no, String name, int pay) {
		this.no = no;
		this.name = name;
		this.pay = pay;
	}
	
	public abstract double getMonthPay(); // 월급 얻는거
	
	
	//정보보기
	public void showEmployeeInfo() {
		System.out.println("사번 : " + this.no);
		System.out.println("이름 : " + this.name);
		System.out.println("임금 : " + this.pay);
	}
	
	public void showEmployeePayInfo() {
		System.out.println("getMonthPay : " + getMonthPay());
		
	}
	
}
