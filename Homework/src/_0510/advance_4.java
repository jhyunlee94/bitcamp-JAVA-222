package _0510;

import java.util.Scanner;

public class advance_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		// 10���ڸ� 1�� �ڸ��� ������ �����ؾ���
		//
		
		int i1 = num/10;
		int i2 = num%10;
		
		if(1<=num && num<=99) {
			if(i1%3==0 || i1%6==0 || i1%9==0) {
				if(i2%3==0 || i2%6==0 ||i2%9==0) {
					System.out.println("�ڼ�¦¦");
				}else {
					System.out.println("�ڼ�¦");
				}
			}
			
		}else {
			System.out.println("�̿��� ���� �Է���");
		}
	}

}
