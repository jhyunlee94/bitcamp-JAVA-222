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
		
		
	}

}
