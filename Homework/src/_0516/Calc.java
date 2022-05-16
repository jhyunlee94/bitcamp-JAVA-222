package _0516;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculater[] calcArr = new Calculater[4];
		
		calcArr[0] = new Add();
		calcArr[1] = new Sub();
		calcArr[2] = new Mul();
		calcArr[3] = new Div();
		
		calcArr[0].setValue(10, 5);
//		calcArr[0].calculate(); //-------------------> µ¡¼À½ÇÇà
		System.out.println(calcArr[0].calculate());
		
		
		calcArr[1].setValue(10, 5);
//		calcArr[1].calculate(); //-------------------> »¬¼À½ÇÇà
		System.out.println(calcArr[1].calculate());
		
		calcArr[2].setValue(10, 5);
//		calcArr[2].calculate(); //-------------------> °ö¼À½ÇÇà
		System.out.println(calcArr[2].calculate());
		
		calcArr[3].setValue(10, 5);
//		calcArr[3].calculate(); //-------------------> ³ª´°¼À½ÇÇà
		System.out.println(calcArr[3].calculate());
		
	}

}
