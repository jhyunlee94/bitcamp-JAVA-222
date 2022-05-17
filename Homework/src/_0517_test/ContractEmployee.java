package _0517_test;

public class ContractEmployee extends Employee{

	int workDay;
	
	public ContractEmployee(String no, String name, int pay, int workDay) {
		super(no, name, pay);
		this.workDay = workDay;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return pay*workDay;
	}

}
