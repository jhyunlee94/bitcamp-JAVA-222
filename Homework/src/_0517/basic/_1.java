package _0517.basic;

public class _1 {

	static int sumArray(int[] num) {

		int sum1 = 0;
		
		for(int i = 0; i < num.length; i++) {
			sum1 += num[i];
		}
		
		return sum1;
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
		
		System.out.println(sumArray(num1));
		System.out.println(sumArray(num2));
	}

}
