package _0510;

import java.util.Scanner;

public class advance_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money;
		
		Scanner sc = new Scanner(System.in);
		money = sc.nextInt();
		
		System.out.println("입금된 금액은 : "+money);
		
		int a = money / 50000;
		int b = (money % 50000)/10000;
		int c = ((money % 50000) %10000)/5000;
		int d = (((money % 50000) %10000) %5000 )/1000;
		int e = ((((money % 50000) %10000) %5000 )%1000)/500;
		int f = (((((money % 50000) %10000) %5000 )%1000)%500)/100;
		int g = ((((((money % 50000) %10000) %5000 )%1000)%500)%100)/50;
		int h = (((((((money % 50000) %10000) %5000 )%1000)%500)%100)%50)/10;
		System.out.println("5만원 :" +a +"개");
		System.out.println("1만원 :" +b +"개");
		System.out.println("5천원 :" +c +"개");
		System.out.println("1천원 :" +d +"개");
		System.out.println("500원 :" +e +"개");
		System.out.println("100원 :" +f +"개");
		System.out.println("50원 :" +g +"개");
		System.out.println("10원 :" +h +"개");
	}

}
