package _0510;

import java.util.Scanner;

public class advance_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money;
		
		Scanner sc = new Scanner(System.in);
		money = sc.nextInt();
		
		System.out.println("�Աݵ� �ݾ��� : "+money);
		
		int a = money / 50000;
		int b = (money % 50000)/10000;
		int c = ((money % 50000) %10000)/5000;
		int d = (((money % 50000) %10000) %5000 )/1000;
		int e = ((((money % 50000) %10000) %5000 )%1000)/500;
		int f = (((((money % 50000) %10000) %5000 )%1000)%500)/100;
		int g = ((((((money % 50000) %10000) %5000 )%1000)%500)%100)/50;
		int h = (((((((money % 50000) %10000) %5000 )%1000)%500)%100)%50)/10;
		System.out.println("5���� :" +a +"��");
		System.out.println("1���� :" +b +"��");
		System.out.println("5õ�� :" +c +"��");
		System.out.println("1õ�� :" +d +"��");
		System.out.println("500�� :" +e +"��");
		System.out.println("100�� :" +f +"��");
		System.out.println("50�� :" +g +"��");
		System.out.println("10�� :" +h +"��");
	}

}
