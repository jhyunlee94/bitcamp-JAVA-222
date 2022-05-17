package _0517.advance;

public class ContractWorker extends Employee {

	int workDay;
	
	public ContractWorker(String no, String name, int pay,int workDay) {
		super(no,name,pay);
		this.workDay = workDay;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return (double)pay * workDay;
	}

	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("workDay : " + workDay);
	}
}
