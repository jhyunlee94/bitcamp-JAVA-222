package _0510;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. while문을 이용해서 1부터 100까지 출력하세요
		int i = 0; 
		System.out.println("1.---------------------");
		while(i<100) {
			i++;
			System.out.println(i);
		}

		int i1 = 9;
		System.out.println("2.---------------------");
		while(i1 < 20) {
			i1++;
			System.out.println(i1);
		}
		
		int i2 = 0;
		int sum2 = 0;
		System.out.println("3.---------------------");
		while(i2 <= 10) {
			sum2 += i2;
			i2++;
		}
		System.out.println(sum2);
		
		int num = 0;
		int i3 = 0;

		while(i3 < 10) {
			i3++;
			if(i3 % 2 ==0) {
				System.out.println(i3);
			}
		}
		
		System.out.println("5.---------------------");
		for (int i4 = 0; i4<=5; i4++) {
			for(int j4 =0; j4<i4;j4++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
