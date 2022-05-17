package _0517.basic;

public class _1_test {

	static int sumArray(int[] num) {
		
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1 = new int[11]; //0~10
		int[] num2 = new int[101]; //0~100
		
		for(int i = 0; i < num1.length; i++) {
			num1[i] = i;
		}
		
		for(int i = 0; i < num2.length; i++) {
			num2[i] = i + 100;
		}
		
		System.out.println(sumArray(num1));
		System.out.println(sumArray(num2));
	}

}
