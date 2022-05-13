package _0513;

public class InkjetPrinter extends Printer{

	int inkOfamount; //À×Å©ÀÜ·®
//	int cnt; // ÀÜ·® ÁÙ¾îµå´Â°Å Ã³¸®¿ë?? 
	
	 InkjetPrinter() {
		this.modelName = "»ï¼º¸ğµ¨";
		this.company = "»ï¼º";
		this.usbName = "USB";
		this.parallerPort = "1111";
		this.remainingOfPaper = 100;
		this.inkOfamount = 100;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("À×Å©Á¬ÇÁ¸°ÅÍ·Î ÇÁ¸°Æ® Ãâ·Â");
		System.out.println("ÀÎ¼â ¿ëÁö ÀÜ·®Àº : "+ --remainingOfPaper);
		System.out.println("À×Å© ÀÜ·®Àº : " + --inkOfamount);
	
		if(remainingOfPaper <= 0) {
			System.out.println("¿ëÁöºÎÁ·");
		}
	}
	
	
}
