package _0511;

import java.util.Scanner;

public class basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<10; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i =0; i<num.length;i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
		
		int sum =0;
		
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		System.out.println(sum);
		
	}

}
