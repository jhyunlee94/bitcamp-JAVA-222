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
			System.out.println("�ٽ��Ͻðڽ��ϱ�(Y/N)?");
			String sel = sc.next();
			if(sel.equals("N")) {
				flag=false;
			}			
		}	
	}
}
