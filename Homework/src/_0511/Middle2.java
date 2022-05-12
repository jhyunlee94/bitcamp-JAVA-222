package _0511;

import java.util.Scanner;

public class Middle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//
//		 int a = sc.nextInt();
//
//		
//		String binary = Integer.toBinaryString(a); // 10진수 -> 2진수
//		String octal = Integer.toOctalString(a); // 10진수 -> 8진수
//		String hexaDecimal = Integer.toHexString(a); // 10진수 -> 16진수
//
//		System.out.println("10진수 : " + a);
//		System.out.println("2진수 : " + binary);
//		System.out.println("8진수 : " + octal);
//		System.out.println("16진수 : " + hexaDecimal);
//		
		
		
		// 0보다 큰 정수를 입력받고 이진수와 16진수로 출력
		Scanner sc = new Scanner(System.in);
		int num;
		//입력받은 정수를 2진수로 변환되어 저장될 배열
		//배열의 길이보다 큰 값이 입력된 경우에는 가변배열
		//가변배열은 배열의 길이가 유동적인 배열
		int[] twoNum = new int[100];

		
		while(true) {
			System.out.println("0보다 큰 정수 입력하세요.");
			num = sc.nextInt();
			if(num <= 0) {
				//continue 만나면 밑에 코드가 실행되지 않고 다시 반복문으로 돌아감
				continue;
			}else {
				break;
			}
		}
		
		System.out.printf("16진수 : 0x%x \n ",num);
		
		
		//2진수로 변환한 값을 배열에 하나씩 담음
		/*
		 * 2|31 ------- 1
		 * 2|15 ------- 1
		 * 2|7  ------- 1
		 * 2|3  ------- 1
		 * 2|1  ------- 1
		 *   0
		 * 
		 * 2|13 ------- 1
		 * 2|6  ------- 0
		 * 2|3  ------- 1
		 * 2|1  ------- 1
		 *   0
		 */
		for(int j = 0; j< twoNum.length; j++) {
			twoNum[j] = num % 2;
			num /=2;
			if(num == 0) {
				break;
			}
		}
		
		//2진수는 저장된 값 반대로 저장해야함

		System.out.print("2진수 : ");
		for (int i = 99; i>=0; i--) {
			// 배열 값이 1을 만났을 때 부터 출력함
			if(twoNum[i] == 1) {
				for(int j = i; j>=0;j--) {
					System.out.print(twoNum[j]);
				}
				System.out.println(" ");
				break;
			}
		}
	}

}
