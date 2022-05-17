package _0517.basic;

public class _3_test {

	static int[] printEven(int[] num) {
		for(int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = new int[11];
		int[] num2 = new int[101];
		
		num1 = printEven(num1);
		num2 = printEven(num2);
		
		for ( int i = 0; i < num1.length; i++) {
			if(i%2==0)
				System.out.print(num1[i] + " ");
		}
		

		System.out.println();
		for(int j = 0; j < num2.length; j++) {	
			if(j%2==0)
			System.out.print(num2[j] + " ");
		}


	}

}
