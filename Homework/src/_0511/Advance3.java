package _0511;

public class Advance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		
		for(i = 0; i<10; i++) {
			for (j =0; j<10; j++) {
				
				if((i * 10 +j) +(j*10+i) == 99) {
					System.out.printf("%d%d + %d%d =%d", i, j, j, i, (i * 10 + j) + (j * 10 + i));
				}
			}
			System.out.println();
		}
	}

}
