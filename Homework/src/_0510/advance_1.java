package _0510;

import java.io.IOException;
import java.util.Scanner;

public class advance_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char str;
		
		str = (char) System.in.read();
		
		if('A'<=str && str<='Z') {
			System.out.println("�빮��");
		}
		else if('a' <=str && str<='z') {
			System.out.println("�ҹ���");
		}
		
//		int num = System.in.read();
//		String str = num >=65 && num <=90 ? "�빮��" :num>=97 && num <=122 ? "�ҹ���" : "�ٽ��Է��ϼ���";
//		
//		System.out.println(str);
		
	}

}
