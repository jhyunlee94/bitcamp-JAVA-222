package _0517.basic;

public class _5 {

	static int[] printOdd(int[] num) {
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = new int[11];
		int[] num2 = new int[101];
		
		num1 = printOdd(num1);
		num2 = printOdd(num2);
		
		for(int i = 0; i < num1.length; i++) {
			if(i%2==1)
				System.out.print(num1[i] +" ");
		}
		
		System.out.println();
		
		for(int i = 0; i < num2.length; i++) {
			if(i%2==1)
				System.out.print(num2[i] + " ");
		}
	}

}
