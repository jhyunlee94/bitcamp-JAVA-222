package _0511;

import java.util.Random;
import java.util.Scanner;

public class Advance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0�� ����, 1�� ����, 2�� ��
		
		Random rd = new Random();
		int com = 0; 
		
		String comCov = ""; // �ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			com = rd.nextInt(3);
			
			switch(com){
				case 0: 
					comCov="����";
					break;
				case 1:
					comCov="����";
					break;
				case 2:
					comCov="��";
					break;
			}
			System.out.println("���� ���� �� �Է��ϼ���");
			String user = sc.next();
			
			if((comCov.equals("����") && user.equals("����")) || (comCov.equals("����") && user.equals("����")) || (comCov.equals("��") && user.equals("��"))) {
				System.out.println("��ǻ�� : " + comCov + "  ����� :" +user);
				System.out.println("�����ϴ�!");
			}
			else if((comCov.equals("����") && user.equals("��")) || (comCov.equals("����")&&user.equals("����"))||(comCov.equals("��")&&user.equals("����")) ){
		//���� �����϶� ����� ��, ���� ���� �϶� ����� ����, ���� ���϶� ����� ����, ����� ��
				System.out.println("��ǻ�� : " + comCov + "  ����� :" +user);
				System.out.println("��");
			}
			else {
				System.out.println("��ǻ�� : " + comCov + "  ����� :" +user);
				System.out.println("��");}
		}
	}
}
