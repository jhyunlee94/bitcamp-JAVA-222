package _0517.basic;

public class _2 {

	static void printEven(int[] num) {
		for(int i = 0; i < num.length; i++)
			if(i%2==0)
		System.out.printf(num[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = new int[11];
		int[] num2 = new int[101];
		
		for(int i = 0; i < num1.length; i++) {
			num1[i] = i;
		}
		
		for(int j = 0; j < num2.length; j++) {	
			num2[j] = j + 100;
		}

		System.out.println();
		printEven(num1);
		printEven(num2);
	}

}
