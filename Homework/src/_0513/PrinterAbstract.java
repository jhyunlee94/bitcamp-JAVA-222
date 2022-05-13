package _0513;

public abstract class PrinterAbstract {

	String modelName; //모델명
	String company; //제조사 
	int numberOfPrints; // 인쇄 매수
	int remainingOfPaper; //인쇄 종이 잔량 
	String usbName; //USB이름
	String parallerPort; //포트번호
	
	public abstract void print();
}
