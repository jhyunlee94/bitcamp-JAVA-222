package _0511;

import java.util.Scanner;

public class Middle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		 int a = sc.nextInt();

		
		String binary = Integer.toBinaryString(a); // 10���� -> 2����
		String octal = Integer.toOctalString(a); // 10���� -> 8����
		String hexaDecimal = Integer.toHexString(a); // 10���� -> 16����

		System.out.println("10���� : " + a);
		System.out.println("2���� : " + binary);
		System.out.println("8���� : " + octal);
		System.out.println("16���� : " + hexaDecimal);


	}

}
