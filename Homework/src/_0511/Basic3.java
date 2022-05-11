package _0511;

public class Basic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[10];
		
		int a = (int)(Math.random()*10);
		
		for(int i = 0; i<num.length; i++) {
			int a1 = (int)(Math.random()*10);
			num[i] = a1;
			if(num[i]%2==1) {
				System.out.print(num[i]+"\t");
			}
		}
		
		
		
		
	}

}
