package _0513;

import java.util.Random;
import java.util.Scanner;

public class GeneratorThreeNum {

	BaseBallMain main = new BaseBallMain(); //���ο� static Random, static Scanner �޾ƿ�
	static int[] randomArr = new int[3]; // ���� 3�� ���� �迭
	
	public void randomNum() {
		for(int i = 0; i < randomArr.length; i++) { // 0~9���� 3���� ���� �迭�� ��� for��
			int[] randomArr = new int[3]; // ���� 3�� ���� �迭
			randomArr[i] = main.rd.nextInt(10); // 0 ~ 9���� �� randomArr.length 3�� ��°�
			System.out.print(randomArr[i] + " "); // ���� ������ Ȯ��
		}
	}
}