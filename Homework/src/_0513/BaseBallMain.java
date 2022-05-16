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
	
	static Random rd = new Random();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeneratorThreeNum g = new GeneratorThreeNum();
		BaseBallMenu b = new BaseBallMenu();
		DecisionBall d = new DecisionBall();
		
		
		boolean flag =true;
		while(flag) {
						
			g.randomNum();
			b.menuDisplay();
			d.decision();
			System.out.println("다시하시겠습니까(Y/N)?");
			String sel = sc.next();
			if(sel.equals("N")) {
				flag=false;
			}			
		}	
	}
}
