package _0511;

import java.util.Scanner;

public class Advance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (int)Math.random()*100;
		
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		int cnt=0;
		if(b>=0 && b<=100) {
			while(a!=b) {
				if(a==b) {
					break;
				}else {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
