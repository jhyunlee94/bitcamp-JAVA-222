package _0517.advance;

public abstract class E_test {

	String no;
	String name;
	int pay;
	
	//추상클래스 생성자 안하지만 공통으로 들어가기에 만들어주고 받는걸로
	E_test(String no, String name, int pay){
		this.no = no;
		this.name = name;
		this.pay = pay;
	}
	
	public abstract double getMonthPay();
	
	public void showEmployeeInfo() {
		System.out.println("사번 : " + this.no);
		System.out.println("이름 : " + this.name);
		System.out.println("임금 : " + this.pay);
	}
	
	public void showMonthPayInfo() {
		System.out.println("monthPay : " + getMonthPay());
		System.out.println("---------------------");
	}
	
	
}
