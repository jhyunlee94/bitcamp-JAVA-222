package _0513;

import java.util.Random;
import java.util.Scanner;

public class BaseBallMain {
	/*
	 * �� ����߿� �� ����� 0~9���� 3���� ������ �ߺ����� ������ ���ڸ� �����մϴ�
	 *  ���� ��� 3 1 9�� �����ߴٸ� �ٸ� �ѻ���� 3����
	 * ���ڸ� ���߰� ����� ����޽��ϴ� ���� ���� ������ �ڸ��� ��� 1��Ʈ����ũ 
	 * ���� ���� �ٸ� �ڸ��� ��� 1���Դϴ� ���ڸ� ���� ���
	 * �ڸ����� ��ġ�� ���� �����ƿ�!!���� ó���մϴ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
	
		Scanner sc = new Scanner(System.in); // �Է� Scanner
		
		int[] randomArr = new int[3];//������ ���� �迭 (0,1,2)
				
		for(int i = 0; i < randomArr.length; i++) { // 0~9���� 3���� ���� �迭�� ��� for��
			randomArr[i] = rd.nextInt(10); // 0 ~ 9���� �� randomArr.length 3�� ��°�
			System.out.print(randomArr[i] + " "); // ���� ������ Ȯ��
		}
		
		//�޴� �Է� �� ���
		
		int[] inputArr = new int[3]; // �Է¹��� �迭

		
		//strike , ball �Ǵ�
		int strike = 0;
		int ball = 0;
		
//		while(strike != 3) {
		while(true) {
			strike = 0;
			ball = 0;

		    System.out.println();
			
			System.out.println("ù��° ���� �Է� >>");
			inputArr[0] = sc.nextInt();
			System.out.println("�ι�° ���� �Է� >>");
			inputArr[1] = sc.nextInt();
			System.out.println("����° ���� �Է� >>");
			inputArr[2] = sc.nextInt();
			System.out.println(inputArr[0] +"," + inputArr[1] +"," + inputArr[2]);
			

			for (int i = 0; i < randomArr.length; i++) {
				for ( int j = 0; j < inputArr.length; j++) {
					if (randomArr[i] == inputArr[j]) {
						if(i == j) { // ���̶� �ε��� ��ġ���� �¾ƾ��� strike++
							strike++;
						}else {
							ball++; // �̿ܿ��� ball++
							
						}
						
					}
				}
			}
			System.out.println("==> "+strike+"��Ʈ����ũ "+ball+"��");
//			if(strike !=3) {
//				strike = 0;
//				ball = 0;
//			}
			if(strike == 3) {
				System.out.println("�����ƿ�");
				break;
			}
		}
	}
}
