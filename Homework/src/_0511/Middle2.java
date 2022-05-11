package _0511;

import java.util.Scanner;

public class Middle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		 int a = sc.nextInt();

		
		String binary = Integer.toBinaryString(a); // 10진수 -> 2진수
		String octal = Integer.toOctalString(a); // 10진수 -> 8진수
		String hexaDecimal = Integer.toHexString(a); // 10진수 -> 16진수

		System.out.println("10진수 : " + a);
		System.out.println("2진수 : " + binary);
		System.out.println("8진수 : " + octal);
		System.out.println("16진수 : " + hexaDecimal);


	}

}
