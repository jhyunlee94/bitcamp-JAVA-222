package _0513;

import java.nio.file.spi.FileSystemProvider;
import java.util.Random;
import java.util.Scanner;

public class TestBallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 두 사람중에 한 사람이 0~9까지 3개의 숫자중 중복없이 임의의 숫자를 선택합니다
		 *  예를 들어 3 1 9를 선택했다면 다른 한사람이 3개의
		 * 숫자를 맞추고 결과를 응답받습니다 같은 숫자 동일한 자리일 경우 1스트라이크 
		 * 같은 숫자 다른 자리일 경우 1볼입니다 세자리 숫자 모두
		 * 자리까지 일치할 경우는 삼진아웃!!으로 처리합니다
		 */
		
		Random rd = new Random(); // Random 난수 생성
		
		int[] randomArr = new int[3]; // 난수 3개 담을 배열
		int[] inputArr = new int[3]; // 입력 3개 담을 배열
		
		System.out.print("Random num : ");
		
		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = rd.nextInt(10); // 0 ~ 9 까지 randomArr 에 randomArr[0] ~ randomArr[2] 까지 담기
			System.out.print(randomArr[i] +" "); 
		}
		
		int strike = 0;
		int ball = 0;
		
		Scanner sc = new Scanner(System.in);
		

		
		while(true) {
			strike = 0; 
			ball = 0;
			
			System.out.println();
			System.out.println("1번째 숫자 입력 >>");
			inputArr[0] = sc.nextInt();
			System.out.println("2번째 숫자 입력 >>");
			inputArr[1] = sc.nextInt();
			System.out.println("3번째 숫자 입력 >>");
			inputArr[2] = sc.nextInt();
			
			
			for(int i = 0; i < randomArr.length; i++) {
				for(int j = 0; j< inputArr.length; j++) {
					if(randomArr[i] == inputArr[j]) { // 같은 숫자
						if(i == j) { // 동일 자리    위 두개 if로 인해 같은 숫자 동일한 자리 즉, 1스트라이크
							strike++;
						}else { // 이외엔 ball 처리
							ball++;
						}
					}
				}
			}
			System.out.println("==>"+strike+"스트라이크" +ball +"볼");
			
			if(strike == 3) {
				System.out.println("삼진아웃");
				break;
			}
		}
	}
}
