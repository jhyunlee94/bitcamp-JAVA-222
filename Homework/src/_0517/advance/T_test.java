package _0517.advance;

public class T_test extends E_test{

	int hireYear;
	
	T_test(String no, String name, int pay, int hireYear) {
		super(no, name, pay);
		this.hireYear = hireYear;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return pay/12;
	}
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("hireYear : " + hireYear);
	}

}
