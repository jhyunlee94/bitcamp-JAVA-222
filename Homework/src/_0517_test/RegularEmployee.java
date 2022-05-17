package _0517_test;

public class RegularEmployee extends Employee{
	
	int bonus;

	public RegularEmployee(String no, String name, int pay, int bonus) {
		super(no, name, pay);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		return pay/12 + bonus/12;
	}

}
