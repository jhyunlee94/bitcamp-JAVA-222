package Day01;

public class _01_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 변수 선언
		int value1; 
		int value2;
		
		//2. 변수 초기화
		value1 = 10;
		
		//3. 변수 사용
		System.out.println(value1);
		
		//4. 초기화되지 않은 변수 사용 시 에러 발생
		
		/* 등록 Ctrl + Shift + / 
		 * 해제 Ctrl + Shift + \
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * The local variable value2 may not have been initialized
		 * 
		 * at Day01._01_variable.main(_01_variable.java:19)
		 */
		
		//System.out.println(value2);
	}

}
