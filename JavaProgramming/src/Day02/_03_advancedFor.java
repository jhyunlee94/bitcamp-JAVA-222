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
		
		System.out.println("������ ������ : "+ sum1);
		
		for (int score : scores) { //�迭 ����� ������ŭ ��Ҹ� �ϳ��� ������ ����ϴ� ���
			sum += score;
		}
		
		System.out.println("������ ������ : " + sum);
	}

}
