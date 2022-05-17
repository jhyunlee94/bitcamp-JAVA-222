package _0517_test;

public class TemporaryEmployee extends Employee{

	int hireYear;
	
	public TemporaryEmployee(String no, String name, int pay, int hireYear) {
		super(no, name, pay);
		this.hireYear = hireYear;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return pay/12;
	}

}
