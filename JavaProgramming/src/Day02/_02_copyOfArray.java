package Day02;

public class _02_copyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. for문 이용한 배열 복사
		//배열의 요소값을 직접 복사하는 방식
		int[] score1 = {100,90,80};
		int[] score2 = new int[5];
		
		for(int i = 0; i < score1.length; i++) {
			score2[i] = score1[i];
			System.out.println(score2[i]);
		}
		System.out.println("---------------------------");
	
	
		//2. arraycopy() 메소드 이용한 배열의 복사
		String[] str1 = {"java", "hello"};
	    String[] str2 = new String[3]; 
	     
	    for(int j = 0; j < str1.length; j++) {
	    	str2[j] = str1[j];
	    	System.out.println(str2[j]);
	    }
	    
		System.out.println("---------------------------");
		//System.arraycopy(원본 배열의 이름, 복사를 시작할 인덱스,
		//복사될 대상의 배열 이름
		//(새 배열의 이름), 새 배열에 복사가 시작되는 인덱스값, 길이);

	    System.arraycopy(str1, 0, str2, 0, str1.length);
	    
	    for(int h = 0; h < str2.length; h++) {
	    	System.out.println(str2[h]);
	    }
	    
		System.out.println("---------------------------");
	}
	

}
