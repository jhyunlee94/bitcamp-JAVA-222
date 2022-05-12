package _0511;

import java.util.Scanner;

public class Advance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (int)(Math.random()*100);
		System.out.println(a);
		Scanner sc = new Scanner(System.in);
		
		int b=0;
		int cnt=1;
		if(b>=0 && b<=100) {
			while(a!=b) {
				b = sc.nextInt();
				if(a==b) {
					break;
				}else {
					cnt++;
				}
			}
			System.out.println(cnt+"회 만에 맞췄음");
		}
	}

}
