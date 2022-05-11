package Day02;

public class _01_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 값 지정하여 배열 초기화
		int[] score1 = {100, 90, 80};
		//100 = score1[0], 90 = score1[1], 80 = score1[2]
		//.length 메소드 : 배열의 길이 리턴
		//.length 메소드는 읽기전용 메소드라서 값의 변경이 불가능
		//score1.length =10; 이런 방식의 값 대입 불가능
		for(int i = 0; i < score1.length; i++) {
			//배열의 요소 하나하나에 접근하는 방식 배열의이름[요소의 인덱스]
			
			System.out.println(score1[i]);
		}
		System.out.println("---------------------------");
		
		//2. new 키워드로 초기화
		// new 키워드 : 배열이나 클래스(객체)를 생성할 때 배열안의 요소나 클래스(객체)안의 내용을 초기화해주는 키워드
		int[] score2 = new int[] {75, 85, 100};
		
		for(int j = 0; j < score2.length; j++) {
			System.out.println(score2[j]);
		}
		System.out.println("---------------------------");
		
		//3. new 키워드로 길이만 지정하고 초기화
		//변수타입에 따라 초기화 값이 다름
		int[] score3 = new int[3]; // 정수, 실수는 0
		String[] str = new String[3]; // String은 null
		
		for(int k = 0; k < score3.length; k++) {
			System.out.println(score3[k]);
		}
		
		for(int h = 0; h < str.length; h++) {
			System.out.println(str[h]);
		}
		System.out.println("---------------------------");
		System.out.println(score3[0]); //0
		System.out.println("---------------------------");
		
		//초기화된 배열 변수의 값 변경
		//배열의 요소에 직접 값 입력
		//for문으로 스캐너나 read.in으로 직접 입력이 가능하다
		score3[0] = 100;
		str[0] = "hello";
		
		System.out.println(score3[0]); //100
		System.out.println(score3[1]); //0
		System.out.println(score3[2]); //0
		System.out.println(str[0]); //hello
		System.out.println(str[1]); //null
		System.out.println(str[2]); //null
		System.out.println("---------------------------");
		
		score3[0] = 101;
		str[0] = "helloZZ";
		System.out.println(score3[0]); //101
		System.out.println(score3[1]); //0
		System.out.println(score3[2]); //0
		System.out.println(str[0]); //helloZZ
		System.out.println(str[1]); //null
		System.out.println(str[2]); //null
		
		System.out.println("---------------------------");
		
		for(int k = 0; k < score3.length; k++) {
			System.out.println(score3[k]);
		}
		
		for(int h = 0; h < str.length; h++) {
			System.out.println(str[h]);
		}
		System.out.println("---------------------------");
		
	}

}
