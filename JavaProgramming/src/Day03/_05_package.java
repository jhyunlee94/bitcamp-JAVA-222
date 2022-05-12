package Day03;

import java.util.Scanner;


//패키지내의 모든 클래스를 지정할 수 있다.
//import Day03.com.test.*;
//import 단축키 ctrl + shift + o
//같은 패키지내의 클래스 아닐 경우 import구문 사용
//import구문 사용 시 명확히 사용할 클래스를 지정하거나
import Day03.com.test.test;


public class _05_package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test.num 이 final 이 아니고 static 이기에 클래스명.속성값으로 변경가능
		test.num = 100;
		
		System.out.println(test.num);
		
		Scanner sc = new Scanner(System.in);
	}

}
