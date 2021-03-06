package Day01;

public class _07_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 산술연산자
		int num1 = 10;
		int num2 = 3;
		
		//num1과 num2 덧셈 연산 결과
		int result = num1 + num2; 
		System.out.printf("%d\n", num1);
		System.out.println("num1 + num2 = " + result);
		System.out.println("----------------------------");
		
		//num1과 num2 뺄셈 연산 결과
		result = num1 - num2; 
		System.out.println("num1 - num2 = " + result);
		System.out.println("----------------------------");
		
		//num1과 num2 곱셈 연산 결과
		result = num1 * num2; 
		System.out.println("num1 * num2 = " + result);
		System.out.println("----------------------------");
		
		//num1과 num2 나눗셈 연산 결과
		result = num1 / num2; 
		System.out.println("num1 / num2 = " + result);
		System.out.println("----------------------------");
		
		//num1과 num2 나머지 연산 결과
		//num1을 num2로 나눈 나머지 표출
		result = num1 % num2; 
		System.out.println("num1 % num2 = " + result);
		System.out.println("----------------------------");
		
		
		//2. 부호연산자
		int num3 = 10;
		//정수나 실수의 부호를 변경할 때 사용
		int num4 = -num3;
		System.out.println(num4);
		System.out.println("----------------------------");
		
		//3. 문자열 결합 연산자
		String str1 = "hello ";
		String str2 = "java";
		//+연산자를 이용하여 두 개의 문자열을 하나의 문자열로 합침
		System.out.println(str1 + str2);
		System.out.println("----------------------------");

		
		//4. 대입연산자
		int num5 = 10;
		int num6 = 3;

		//num5에 num5 와 num6 를 더한 값을 저장
		num5 += num6;
		System.out.println(num5);
		System.out.println("----------------------------");
		
		//num5에 num5 와 num6 를 더한 값을 저장
		num5 -= num6;
		System.out.println(num5);
		System.out.println("----------------------------");
		
		//num5에 num5 와 num6 를 더한 값을 저장
		num5 *= num6;
		System.out.println(num5);
		System.out.println("----------------------------");
		
		//num5에 num5 와 num6 를 더한 값을 저장
		num5 /= num6;
		System.out.println(num5);
		System.out.println("----------------------------");
	
		//num5에 num5 와 num6 를 더한 값을 저장
		num5 %= num6;
		System.out.println(num5);
		System.out.println("----------------------------");
		
		
		//5. 증감연산자
		//++ : 해당 변수를 1증가시킨 값을 저장
		//-- : 해당 변수를 1감소시킨 값을 저장
		//선위 증감연산자
		//명령이 실행되기 전에 증감이 진행된다.
		int num7 = 100;
		System.out.println(++num7);
		System.out.println(--num7);
		System.out.println("----------------------------");
		
		//후위 증감연산자
		//명령이 실행되고 난 후 증감이 진행된다.
		System.out.println(num7++);
		System.out.println(num7--);
		System.out.println("----------------------------");
		System.out.println(num7);
		System.out.println("----------------------------");
		
		//6. 비교연산자
		//비교연산자는 두 변수 값을 비교하여 true, false 를 리턴하는 연산자
		int num8 = 10;
		int num9 = 20; 
		
		//비교연산자에 주의할 점은 왼쪽있는 대상이 피연산자가 됨
		//num8 < num9 : num8이 num9보다 작은 지를 비교
		// == : 같은 값인지 비교
		boolean result2 = num8 == num9;
		System.out.println(result2);
		System.out.println("----------------------------");
		
		// < : 작은 값인지 비교
		result2 = num8 < num9;
		System.out.println(result2);
		System.out.println("----------------------------");
		
		// > : 큰 값인지 비교
		result2 = num8 > num9;
		System.out.println(result2);
		System.out.println("----------------------------");
		
		// <= : 작거나 같은 값인지 비교
		result2 = num8 <= num9;
		System.out.println(result2);
		System.out.println("----------------------------");
		
		// >= : 크거나 같은 값인지 비교
		result2 = num8 >= num9;
		System.out.println(result2);
		System.out.println("----------------------------");
		
		// != : 다른 값인지 비교
		result2 = num8 != num9;
		System.out.println(result2);
		System.out.println("----------------------------");
		
		
		//7. 논리연산자
		// && : 두 값이 모두 true여야 true 리턴(AND 연산)
		result2 = (num8 < 30) && (num9 < 20);
		System.out.println(result2);
		System.out.println("----------------------------");
		
		result2 = (num8 < 30) && (num9 < 20);
		System.out.println(result2);
		System.out.println("----------------------------");
		
		// || : 두 값중 하나만 true여도 true 리턴(OR 연산)
		result2 = (num8 < 30) || (num9 < 20);
		System.out.println(result2);
		System.out.println("----------------------------");
		
	
		// ! : 현재 논리 값의 반대 값(NOT 연산)
		result2 = !(num8 < 30); 
		System.out.println(result2);
		System.out.println("----------------------------");
		
		
		//8. 삼항 비교연산자
		//?앞의 값의 상태에 따라서 값이 결정됨
		//?앞의 연산이 true일 경우 :의 왼쪽 값
		//?앞의 연산이 false일 경우 :의 오른쪽 값
		int result3 = (10 < 30) ? 100 : -100;
		System.out.println(result3);
		System.out.println("----------------------------");
		
	}
	

}
