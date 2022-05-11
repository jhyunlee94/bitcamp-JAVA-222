package _0511;

public class Middle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1000;
		int sum =0;
		for(int i = num; i>=0; i--) {
			if(i%2==0 && i%7==0) {
				sum +=i;
			}
			
		}
		System.out.println(sum);
	}

}
