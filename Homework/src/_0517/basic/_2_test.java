package _0517.basic;

public class _2_test {

	static void printEven(int[] num) {
		for(int i = 0; i < num.length; i++) {
			if(i%2==0)
			System.out.print(num[i] + " ");
		}
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
		
		printEven(num1);
		System.out.println();
		printEven(num2);
	}

}
