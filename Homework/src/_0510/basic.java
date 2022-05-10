package _0510;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 10 ~ 1까지 거꾸로 while문으로 출력
		System.out.println("1.---------------------");
		int i = 11;
		while(i > 1) {
			i--;
			System.out.println(i);
		}
		//2. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
		
		System.out.println("2.---------------------");
		
		int i1 = 11;
		do {
			i1--;
			System.out.println(i1);
		}while(i1>1);
		
		//3. 10 ~ 1까지 거꾸로 for문으로 출력
		System.out.println("3.---------------------");
		
		//int i2 = 11;
		for (int i2 = 10; i2 > 0; i2--) {
			System.out.println(i2);
		}
		
		//4. 1 ~ 100까지 합을 while문으로 출력
		int sum = 0;
		int i3 = 0;
		while(i3 <= 100) {
			sum +=i3;
			i3++;
		}
		System.out.println("4.---------------------");
		System.out.println(sum);
		
		//5. 1 ~ 100 까지 합을 do ~ while문으로 출력
		
		int i4 = 0;
		int sum2 = 0;
		do {
			sum2 += i4;
			i4++;
			
		}while(i4 <= 100);
		System.out.println("5.---------------------");
		System.out.println(sum2);
		
		//6. 1 ~ 100까지 합을 for문으로 출력
		int sum3 = 0;
		for (int i5 = 1; i5 <=100; i5++) {
			sum3 += i5;
		}
		System.out.println("6.---------------------");
		System.out.println(sum3);
	}

}
