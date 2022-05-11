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
		
		for (int score : scores) { //배열 요소의 갯수만큼 요소를 하나씩 꺼내서 사용하는 방식
			sum += score;
		}
		
		System.out.println("점수의 총합은 : " + sum);
	}

}
