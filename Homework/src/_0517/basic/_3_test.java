package _0517.basic;

public class _3_test {

//	static int[] printEven(int[] num) {
//		for(int i = 0; i < num.length; i++) {
//			num[i] = i;
//		}
//		return num;
//	}
//	
//	public static void main(String[] args) {
//		int[] num1 = new int[11];
//	int[] num2 = new int[101];
//	num1 = printEven(num1);
//	num2 = printEven(num2);
//	
//	for ( int i = 0; i < num1.length; i++) {
//		if(i%2==0)
//			System.out.print(num1[i] + " ");
//	}
//	
//	
//	System.out.println();
//	for(int j = 0; j < num2.length; j++) {	
//		if(j%2==0)
//		System.out.print(num2[j] + " ");
//	}
//	}
//	
//	������ڵ�
	public static int[] printEven(int[] arr) {
		int[] returnArr = new int[arr.length / 2 + 1];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				returnArr[index++] = arr[i];
				}
		}
		
		return returnArr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr1 = new int[11];
		int[] numArr2 = new int[101];

		for(int i = 0; i < numArr1.length; i++) {
			numArr1[i] = i;
		}

	
		
		for(int j = 0; j < numArr2.length; j++) {
			numArr2[j] = j + 100;
		}
		
		int[] evenArr1 = printEven(numArr1);
		int[] evenArr2 = printEven(numArr2);
		
		
		for(int i = 0; i < evenArr1.length; i++) {
			System.out.print(evenArr1[i] + "\t");
		}
		
		System.out.println();
		
		for(int i = 0; i < evenArr2.length; i++) {
			System.out.print(evenArr2[i] + "\t");
		}
	}
}


