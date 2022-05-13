package _0513;

import java.util.Random;
import java.util.Scanner;

public class BaseBallMain {
	/*
	 * 두 사람중에 한 사람이 0~9까지 3개의 숫자중 중복없이 임의의 숫자를 선택합니다
	 *  예를 들어 3 1 9를 선택했다면 다른 한사람이 3개의
	 * 숫자를 맞추고 결과를 응답받습니다 같은 숫자 동일한 자리일 경우 1스트라이크 
	 * 같은 숫자 다른 자리일 경우 1볼입니다 세자리 숫자 모두
	 * 자리까지 일치할 경우는 삼진아웃!!으로 처리합니다
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
	
		Scanner sc = new Scanner(System.in); // 입력 Scanner
		
		int[] randomArr = new int[3];//난수를 담을 배열 (0,1,2)
				
		for(int i = 0; i < randomArr.length; i++) { // 0~9까지 3개의 숫자 배열에 담는 for문
			randomArr[i] = rd.nextInt(10); // 0 ~ 9까지 수 randomArr.length 3개 담는거
			System.out.print(randomArr[i] + " "); // 난수 데이터 확인
		}
		
		//메뉴 입력 및 출력
		
		int[] inputArr = new int[3]; // 입력받을 배열

		
		//strike , ball 판단
		int strike = 0;
		int ball = 0;
		
//		while(strike != 3) {
		while(true) {
			strike = 0;
			ball = 0;

		    System.out.println();
			
			System.out.println("첫번째 숫자 입력 >>");
			inputArr[0] = sc.nextInt();
			System.out.println("두번째 숫자 입력 >>");
			inputArr[1] = sc.nextInt();
			System.out.println("세번째 숫자 입력 >>");
			inputArr[2] = sc.nextInt();
			System.out.println(inputArr[0] +"," + inputArr[1] +"," + inputArr[2]);
			

			for (int i = 0; i < randomArr.length; i++) {
				for ( int j = 0; j < inputArr.length; j++) {
					if (randomArr[i] == inputArr[j]) {
						if(i == j) { // 값이랑 인덱스 위치까지 맞아야지 strike++
							strike++;
						}else {
							ball++; // 이외에는 ball++
							
						}
						
					}
				}
			}
			System.out.println("==> "+strike+"스트라이크 "+ball+"볼");
//			if(strike !=3) {
//				strike = 0;
//				ball = 0;
//			}
			if(strike == 3) {
				System.out.println("삼진아웃");
				break;
			}
		}
	}
}
