package _0517.advance;

public abstract class Employee {
	String no;
	String name;
	int pay;
	
	//추상클래스는 생성자를 만들수 없다
	//추상메서드
	public abstract double getMonthPay();
	
	public Employee(String no, String name, int pay) {
		this.no = no;
		this.name = name;
		this.pay = pay;
	}
	
	//일반메서드
	public void showEmployeeInfo() {
		System.out.println("사번 : " + this.no);
		System.out.println("이름 : " + this.name);
		System.out.println("임금 : " + this.pay);
	}
	/**
	 * 사원정보 + 월급정보 출력하는 기능
	 */
	public void showMonthPayInfo() {
		showEmployeeInfo();
		System.out.println("monthPay: " + getMonthPay());
		System.out.println("-----------------------");
	}
}
