package _0517.middle;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ICar h = new HyundaiCar();
//		ICar k = new KiaCar();
//		ICar t = new ToyotaCar();
//		
//		h.startEngine();
//		h.speedUp();
//		h.speedDown();
//		h.hitBreak();
//		
//
//		k.startEngine();
//		k.speedUp();
//		k.speedDown();
//		k.hitBreak();
//		
//
//		t.startEngine();
//		t.speedUp();
//		t.speedDown();
//		t.hitBreak();
//		
		ICar[] iCar = new ICar[3];
		
		iCar[0] = new HyundaiCar();
		iCar[1] = new KiaCar();
		iCar[2] = new ToyotaCar();
		
		for(int i = 0; i < iCar.length; i++) {
			iCar[i].startEngine();
			iCar[i].speedUp();
			iCar[i].speedDown();
			iCar[i].hitBreak();
		}
	}

}
