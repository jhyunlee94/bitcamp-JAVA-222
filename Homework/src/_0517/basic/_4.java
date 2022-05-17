package _0517.basic;

public class _4 {

	
	static void printOdd(int[] num) {
		for(int i = 0; i < num.length; i++) {
			if(i%2==1)
				System.out.print(num[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = new int[11];
		int[] num2 = new int[101];
		
		for(int i = 0; i < num1.length; i++) {
			num1[i] = i;
		}
		
		for(int i = 0; i< num2.length; i++) {
			num2[i] =i;
		}
		
		printOdd(num1);
		System.out.println();
		printOdd(num2);
		
	}

}
