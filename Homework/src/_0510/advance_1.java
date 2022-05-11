package _0510;

import java.io.IOException;
import java.util.Scanner;

public class advance_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char str;
		
		str = (char) System.in.read();
		
		if('A'<=str && str<='Z') {
			System.out.println("대문자");
		}
		else if('a' <=str && str<='z') {
			System.out.println("소문자");
		}
		
//		int num = System.in.read();
//		String str = num >=65 && num <=90 ? "대문자" :num>=97 && num <=122 ? "소문자" : "다시입력하세여";
//		
//		System.out.println(str);
		
	}

}
