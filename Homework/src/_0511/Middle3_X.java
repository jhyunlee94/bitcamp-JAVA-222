package _0511;

public class Middle3_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//모르겠음
//
//		int[] num = new int[20]; // 사용자로부터 입력받을 배열
//		int[] num1 = new int[20]; //정렬해서 채울 배열 
//		int j=0,k=1;
//		for(int i =0; i<num.length; i++) {
//			num[i] = (int)(Math.random() *101);
//		}
//		
//		for(int i=0; i<num.length; i++) { 
//			if(num[i]%2==1) { // 홀수는 앞에서부터 저장
//				num1[j]=num[i]; //j임을 기억
//				j++;
//			}else { // 짝수는 뒤에서부터 저장 
//				num1[num.length-k] = num[i];
//				k++;
//			}
//		}
//		
//		for(int i =0; i<num.length; i++) {
//			System.out.print(num1[i] + "\t");
//		}
//		
		/*3. 20개 배열을 선언하세요
		 20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
		 먼저 인덱스의 홀수번째는 앞에서부터 출력하고
		 짝수번째는 뒤에서부터 출력하세요*/
	int[] nums = new int[20];
	
	for(int i = 0; i < nums.length; i++) {
//		nums[i] = (int)(Math.random() * 101);
		nums[i] = i;
	}
	
	for(int j = 0; j < nums.length; j++) {
		//인덱스가 홀수일 때는 순서대로 출력
		if(j % 2 == 1) {
			System.out.print(nums[j] + " ");
		//인덱스가 짝수일 때는 거꾸로 출력
		} else {
				//j == 0 => index == 18
				//j == 2 => index == 16
			System.out.print(nums[nums.length - 2 - j] +" ");
		}
	}
	
	
	}
}
