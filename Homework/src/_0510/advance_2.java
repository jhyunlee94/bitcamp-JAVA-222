package _0510;

import java.io.IOException;

public class advance_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char str;
		
		str = (char) System.in.read();
		if('A'<=str && str<='Z') {
			System.out.println((char)(str+32)); //(char) 명시적 변환, a 97, A 65
		}
		else if('a' <=str && str<='z') {
			System.out.println((char)(str-32));
		}
		
		
//		int num = System.in.read();
//		char ch = num >=65 && num <= 90 ? (char)(num + 32) : num >= 97 && num<= 122 ? (char)(num-32):'-';
//		System.out.println(ch);
		
	}

}
