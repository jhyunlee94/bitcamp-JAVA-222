package _0517.middle;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICar h = new HyundaiCar();
		ICar k = new KiaCar();
		ICar t = new ToyotaCar();
		
		h.startEngine();
		h.speedUp();
		h.speedDown();
		h.hitBreak();
		

		k.startEngine();
		k.speedUp();
		k.speedDown();
		k.hitBreak();
		

		t.startEngine();
		t.speedUp();
		t.speedDown();
		t.hitBreak();
	}

}
