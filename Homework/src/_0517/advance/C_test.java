package _0517.advance;

public class C_test extends E_test{

	int workDay;
	
	C_test(String no, String name, int pay, int workDay) {
		super(no, name, pay);
		this.workDay = workDay;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return pay*workDay;
	}
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("workDay : " + workDay);
	}

}
