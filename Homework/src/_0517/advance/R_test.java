package _0517.advance;

public class R_test extends E_test{

	int bonus;
	
	R_test(String no, String name, int pay, int bonus) {
		super(no, name, pay);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return pay/12+bonus/12;
	}
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("bonus : " + bonus);
	}

}
