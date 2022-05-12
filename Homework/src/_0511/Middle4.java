package _0511;

public class Middle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		4. 처음에 은행에 맡긴 돈은 10000원입니다
		금리는 연 10%입니다
		복리이자로 계산했을 때 10년후 얼마가 될까요?

		단리번의 계산공식
		 원리합계(S)=원금(P) x ( 1+ 이율(i) x 운용기간(n) )

		복리법 계산공식
		원리합계(S) = 원금 (P) x ( 1 + 이율(i) ) ^운용기간(n)
		*/
		
		//원금 10000원
//		double money = 1000000;
//		
//		//금리 10%
//		double rate = 0.1;
//		
//		//예치 10년
//		int year = 10;
//		

//		for(int i = 1; i<=year; i++) {
//			money = money + (money * rate);
//		//	System.out.println(money+"원");
//		}
//		
		double money = 10000;

		for(int i = 1; i <=10; i++) {
			money = money + (money * 0.1);
		}
		
		
		System.out.println(money+"원");
	}
}

