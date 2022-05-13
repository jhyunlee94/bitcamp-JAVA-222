package _0513;

public class LaserPrinter extends Printer{

	int tonerOfamount; //토너잔량

	public LaserPrinter() {
		this.modelName = "LG모델";
		this.company = "LG";
		this.usbName = "USB";
		this.parallerPort = "2222";
		this.remainingOfPaper = 1;
		this.tonerOfamount = 1;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("토너프린터로 프린트 출력");
		System.out.println("인쇄 용지 잔량은 : "+ --remainingOfPaper);
		System.out.println("토너 잔량은 : " + --tonerOfamount);
	
		if(remainingOfPaper <= 0) {
			System.out.println("용지부족");
		}
	}
	
	
}
