package Day01;

import java.util.Scanner;

public class _08_ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. if else if else 구문
	//	int score = 75;

		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
//			inputData = scanner.nextLine();
			int score = scanner.nextInt();
//			//문자열 비교는 equals 메소드 사용
//			if(inputData.equals(119)) {
//				break;
//			}
			//score가 90점 이상이면 A등급
			if(score >=90) {
				System.out.println("A");
				//score가 80점 이상이면 B등급
			} else if(score >= 80) {
				System.out.println("B");
				//score가 70점 이상이면 C등급
			} else if(score >= 70) {
				System.out.println("C");
				//score가 70점 미만이면 D등급
			}else {
				System.out.println("D");
			}
		}
	}

}
