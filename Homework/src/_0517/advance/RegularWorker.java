package _0517.advance;

public class RegularWorker extends Employee{

	int bonus;

	public RegularWorker(String no, String name, int pay,int bonus) {
		super(no, name, pay);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("bonus : " + bonus);
	}
	@Override
	public double getMonthPay() {
		return (double)(pay / 12) + (double)(bonus / 12);
	}

}
