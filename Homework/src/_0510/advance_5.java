package _0510;

import java.util.Scanner;

public class advance_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c=0; 
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
//		System.out.printf("�غ��� : ");
//		a = sc1.nextInt();
//		System.out.printf("���̴� : ");
//		b = sc2.nextInt();
//		System.out.printf("�밢���� : ");
//		c = sc3.nextInt();
//		
//		System.out.println(+a +" " + b +" " + c);
//		
//		if((a+b) >c) {
//			System.out.println("�ﰢ�� ��");
//		}else {
//			System.out.println("�ȵ�");
//		}
//		
//		
		a = sc1.nextInt();
		b = sc2.nextInt();
		c = sc3.nextInt();
		int max=0,x=0,y=0;
		
		if(a>b && b>c) {
			max =a; x=b; y=c;
		} else if(a>c && c>b) {
			max =a; x=b; y=c;
		} else if(b>c && c>a) {
			max =b; x=c; y=a;
		} else if(b>a && a>c) {
			max =b; x=c; y=a;
		} else if(c>a && a>b) {
			max =c; x=a;y=b;
	
		} else if(c>b && b>a) {
			max =c; x=a;y=b;
		}
		
		if(max < (x+y)) //���� �� �� < �ٸ� �� ���� ��
			System.out.println("�ﰢ����");
		else 
			System.out.println("�ȵ�");
	}

}
