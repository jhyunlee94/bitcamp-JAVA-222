package Day01;

public class _02_typeOfVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 변수 선언과 동시에 초기화
		int num1 = 1;
		
		//2. JVM은 정수형 변수를 기본적으로 int로 컴파일하기 때문에
		// 리터럴 상수인 L를 정수 뒤에 붙여서 long형 타입으로 명시해줘야 됨
		long bigNum1 = 10; 
		long bigNum2 = 10L;
		
		//3. int형 범위를 초과한 정수에 대해서 리터럴상수 L이 없으면 int으로
		// 인식되어 에러 발생
		//long bigNum3 = 10000000000000000;
		long bigNum4 = 10000000000000000L;
		
		//4. char형은 문자 그대로 출력 
		// int형에 무자 저장 시, 해당 문자에 ASCII 코드 값 출력됨
		char ch1 = 'A';
		int ch2 = 'A';
		
		System.out.println(num1);
		System.out.println(bigNum2);
		System.out.println(bigNum4);
		System.out.println("----------------------------");
		System.out.println(ch1);
		System.out.println(ch2);
		
		//5. 문자열 타입 사용
		String str1 = "hello java"; // "" 로 표시해서 사용함
		//6. 이스케이프 문자 사용
		String str2 = "hello \"java\""; //문자열안에 "" 넣고 싶을땐 앞에 \ 추가
		String str3 = "hello \tjava";
		String str4 = "hello \njava";
		
		//syso + ctrl + space
		System.out.println("----------------------------");
		System.out.println();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//7. 실수형 타입 사용
		// JVM에서 실수형 타입은 기본저으로 double 형으로 컴파일되기 때문에
		// float타입에 리터럴문자인 f를 표기하지 않으면 에러발생
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from double to float
		//float var1 = 3.14;
		float var2 = 3.14f;
		double var3 = 3.14; 
		
		//System.out.println(var1);
		System.out.println("----------------------------");
		System.out.println(var2);
		System.out.println(var3);
		
		//8. boolean 타입 사용
		boolean var4 = true; //true로 초기화
		boolean var5 = true;
		
		int num2 = 10;
		int num3 = 11;
		
		//num2를 2로 나눈 나머지가 0일 때
		if(num2 %2 ==0) {
			var4 = true;
		//num2를 2로 나눈 나머지가 0이 아닐 때
		}else {
			var4 = false;
		}
		//num3를 2로 나눈 나머지가 0일 때
		if(num3 %2 ==0) {
			var5 = true;
		//num3를 2로 나눈 나머지가 0이 아닐 때
		}else {
			var5 = false;
		}
		System.out.println("----------------------------");
		System.out.println(var4);
		System.out.println(var5);
		
		
		//test
		
	}

}
