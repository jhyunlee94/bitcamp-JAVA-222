package Day02;

public class Calculator {
	
	//int�� �Ű����� �� ���� �޾� ���� ���� �����ϴ� �Լ�
	int add(int x, int y) {
		return x + y;
	}
	
	
	//int�� �Ű����� �� ���� �޾Ƽ� ���� ���� double�� ������ �����ϴ� �޼ҵ�
	double devide(int x, int y) {
		return (double)x / y ; // double int�� ���� ����ȯ�ϸ��� �� ū double�� ��
	}
	
	
	//�Ű������� ������ �� �� �޼ҵ��� ����
	//�Ű������� ������ ���� �� ���� �����ε��Ͽ� �޼ҵ带 �������ϸ� 
	//�ҽ��ڵ��� ���̰� ������� ���������� ������
	//�迭�� �Ű������� �޾Ƽ� �� ���� �Ű������� ���͵� ó������ �ϵ��� �޼ҵ带 ����
	int sum(int[] scores) {
		int totalScore = 0;
		
		for(int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return totalScore;
	}
}
