package _0513;

public class InkAbstract extends PrinterAbstract{
	int inkOfamount; //잉크잔량
//	int cnt; // 잔량 줄어드는거 처리용?? 
	
	InkAbstract() {
		this.modelName = "삼성모델";
		this.company = "삼성";
		this.usbName = "USB";
		this.parallerPort = "1111";
		this.remainingOfPaper = 100;
		this.inkOfamount = 100;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("잉크젯프린터로 프린트 출력");
		System.out.println("인쇄 용지 잔량은 : "+ --remainingOfPaper);
		System.out.println("잉크 잔량은 : " + --inkOfamount);
	
		if(remainingOfPaper <= 0) {
			System.out.println("용지부족");
		}
	}

}
