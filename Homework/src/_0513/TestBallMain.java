package _0513;

import java.nio.file.spi.FileSystemProvider;
import java.util.Random;
import java.util.Scanner;

public class TestBallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �� ����߿� �� ����� 0~9���� 3���� ������ �ߺ����� ������ ���ڸ� �����մϴ�
		 *  ���� ��� 3 1 9�� �����ߴٸ� �ٸ� �ѻ���� 3����
		 * ���ڸ� ���߰� ����� ����޽��ϴ� ���� ���� ������ �ڸ��� ��� 1��Ʈ����ũ 
		 * ���� ���� �ٸ� �ڸ��� ��� 1���Դϴ� ���ڸ� ���� ���
		 * �ڸ����� ��ġ�� ���� �����ƿ�!!���� ó���մϴ�
		 */
		
		Random rd = new Random(); // Random ���� ����
		
		int[] randomArr = new int[3]; // ���� 3�� ���� �迭
		int[] inputArr = new int[3]; // �Է� 3�� ���� �迭
		
		System.out.print("Random num : ");
		
		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = rd.nextInt(10); // 0 ~ 9 ���� randomArr �� randomArr[0] ~ randomArr[2] ���� ���
			System.out.print(randomArr[i] +" "); 
		}
		
		int strike = 0;
		int ball = 0;
		
		Scanner sc = new Scanner(System.in);
		

		
		while(true) {
			strike = 0; 
			ball = 0;
			
			System.out.println();
			System.out.println("1��° ���� �Է� >>");
			inputArr[0] = sc.nextInt();
			System.out.println("2��° ���� �Է� >>");
			inputArr[1] = sc.nextInt();
			System.out.println("3��° ���� �Է� >>");
			inputArr[2] = sc.nextInt();
			
			
			for(int i = 0; i < randomArr.length; i++) {
				for(int j = 0; j< inputArr.length; j++) {
					if(randomArr[i] == inputArr[j]) { // ���� ����
						if(i == j) { // ���� �ڸ�    �� �ΰ� if�� ���� ���� ���� ������ �ڸ� ��, 1��Ʈ����ũ
							strike++;
						}else { // �̿ܿ� ball ó��
							ball++;
						}
					}
				}
			}
			System.out.println("==>"+strike+"��Ʈ����ũ" +ball +"��");
			
			if(strike == 3) {
				System.out.println("�����ƿ�");
				break;
			}
		}
	}
}
