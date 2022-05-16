package _0513;


public class BaseBallMenu {

	BaseBallMain main = new BaseBallMain(); //메인에 static Random, static Scanner 받아옴
	
	static int[] inputArr = new int[3]; // 입력 3개 담을 배열
	
	public void menuDisplay() {
	
		//메뉴를 담당하는 역할
		System.out.println();
		System.out.println("1번째 숫자 입력 >>");
		inputArr[0] = main.sc.nextInt();
		System.out.println("2번째 숫자 입력 >>");
		inputArr[1] = main.sc.nextInt();
		System.out.println("3번째 숫자 입력 >>");
		inputArr[2] = main.sc.nextInt();
		}
}
