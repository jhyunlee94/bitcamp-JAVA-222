package _0511;

public class Middle3_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//모르겠음

		int[] num = new int[20]; // 사용자로부터 입력받을 배열
		int[] num1 = new int[20]; //정렬해서 채울 배열 
		int j=0,k=1;
		for(int i =0; i<num.length; i++) {
			num[i] = (int)(Math.random() *101);
		}
		
		for(int i=0; i<num.length; i++) { 
			if(num[i]%2==1) { // 홀수는 앞에서부터 저장
				num1[j]=num[i]; //j임을 기억
				j++;
			}else { // 짝수는 뒤에서부터 저장 
				num1[num.length-k] = num[i];
				k++;
			}
		}
		
		for(int i =0; i<num.length; i++) {
			System.out.print(num1[i] + "\t");
		}
	}
}
