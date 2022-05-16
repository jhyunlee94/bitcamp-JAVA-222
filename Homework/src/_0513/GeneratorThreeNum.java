package _0513;

import java.util.Random;
import java.util.Scanner;

public class GeneratorThreeNum {

	BaseBallMain main = new BaseBallMain(); //메인에 static Random, static Scanner 받아옴
	static int[] randomArr = new int[3]; // 난수 3개 담을 배열
	
	public void randomNum() {
		for(int i = 0; i < randomArr.length; i++) { // 0~9까지 3개의 숫자 배열에 담는 for문
			int[] randomArr = new int[3]; // 난수 3개 담을 배열
			randomArr[i] = main.rd.nextInt(10); // 0 ~ 9까지 수 randomArr.length 3개 담는거
			System.out.print(randomArr[i] + " "); // 난수 데이터 확인
		}
	}
}