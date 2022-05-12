package _0511;

import java.util.Scanner;

public class Basic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i =0; i<num.length;i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
		
		for(int i = 0; i<num.length; i++) {
			//이거나라는 말은 ||임
			if(num[i]%2==0 || num[i]%3==0) {
				System.out.print(num[i]+"\t");
			}
		}
	}

}
