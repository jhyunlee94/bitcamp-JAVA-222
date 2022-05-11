package Day02;

public class _03_advancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {100,90,80};
		int[] scores1 = {100,90,80};
		int sum = 0;
		int sum1 = 0;
		
		for (int i = 0; i < scores1.length; i++) {
			sum1 += scores1[i];
		}
		
		System.out.println("점수의 총합은 : "+ sum1);
		
		//scores 배열의 요소 개수만큼 반복
		//scores 배열의 요소 하나씩 꺼내서 score 변수에 담아서 사용
		for (int score : scores) { //배열 요소의 갯수만큼 요소를 하나씩 꺼내서 사용하는 방식
			sum += score;
		}// for이 scores 배열 요소만큼 3번 돌거고 score에 담고 sum에 합한 값이 총합이 된다.
		
		System.out.println("점수의 총합은 : " + sum);
	}

}
