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
//		String binary = Integer.toBinaryString(a); // 10���� -> 2����
//		String octal = Integer.toOctalString(a); // 10���� -> 8����
//		String hexaDecimal = Integer.toHexString(a); // 10���� -> 16����
//
//		System.out.println("10���� : " + a);
//		System.out.println("2���� : " + binary);
//		System.out.println("8���� : " + octal);
//		System.out.println("16���� : " + hexaDecimal);
//		
		
		
		// 0���� ū ������ �Է¹ް� �������� 16������ ���
		Scanner sc = new Scanner(System.in);
		int num;
		//�Է¹��� ������ 2������ ��ȯ�Ǿ� ����� �迭
		//�迭�� ���̺��� ū ���� �Էµ� ��쿡�� �����迭
		//�����迭�� �迭�� ���̰� �������� �迭
		int[] twoNum = new int[100];

		
		while(true) {
			System.out.println("0���� ū ���� �Է��ϼ���.");
			num = sc.nextInt();
			if(num <= 0) {
				//continue ������ �ؿ� �ڵ尡 ������� �ʰ� �ٽ� �ݺ������� ���ư�
				continue;
			}else {
				break;
			}
		}
		
		System.out.printf("16���� : 0x%x \n ",num);
		
		
		//2������ ��ȯ�� ���� �迭�� �ϳ��� ����
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
		
		//2������ ����� �� �ݴ�� �����ؾ���

		System.out.print("2���� : ");
		for (int i = 99; i>=0; i--) {
			// �迭 ���� 1�� ������ �� ���� �����
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
