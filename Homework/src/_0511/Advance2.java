package _0511;

import java.util.Random;
import java.util.Scanner;

public class Advance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0은 바위, 1은 가위, 2는 보
		
		Random rd = new Random();
		int com = 0; 
		
		String comCov = ""; // 초기화
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			com = rd.nextInt(3);
			
			switch(com){
				case 0: 
					comCov="바위";
					break;
				case 1:
					comCov="가위";
					break;
				case 2:
					comCov="보";
					break;
			}
			System.out.println("가위 바위 보 입력하세요");
			String user = sc.next();
			
			if((comCov.equals("가위") && user.equals("가위")) || (comCov.equals("바위") && user.equals("바위")) || (comCov.equals("보") && user.equals("보"))) {
				System.out.println("컴퓨터 : " + comCov + "  사용자 :" +user);
				System.out.println("비겼습니다!");
			}
			else if((comCov.equals("가위") && user.equals("보")) || (comCov.equals("바위")&&user.equals("가위"))||(comCov.equals("보")&&user.equals("바위")) ){
		//컴이 가위일때 사용자 보, 컴이 바위 일때 사용자 가위, 컴이 보일때 사용자 가위, 사용자 패
				System.out.println("컴퓨터 : " + comCov + "  사용자 :" +user);
				System.out.println("패");
			}
			else {
				System.out.println("컴퓨터 : " + comCov + "  사용자 :" +user);
				System.out.println("승");}
		}
	}
}
