package Day02;

public class _01_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. �� �����Ͽ� �迭 �ʱ�ȭ
		int[] score1 = {100, 90, 80};
		//100 = score1[0], 90 = score1[1], 80 = score1[2]
		//.length �޼ҵ� : �迭�� ���� ����
		//.length �޼ҵ�� �б����� �޼ҵ�� ���� ������ �Ұ���
		//score1.length =10; �̷� ����� �� ���� �Ұ���
		for(int i = 0; i < score1.length; i++) {
			//�迭�� ��� �ϳ��ϳ��� �����ϴ� ��� �迭���̸�[����� �ε���]
			
			System.out.println(score1[i]);
		}
		System.out.println("---------------------------");
		
		//2. new Ű����� �ʱ�ȭ
		// new Ű���� : �迭�̳� Ŭ����(��ü)�� ������ �� �迭���� ��ҳ� Ŭ����(��ü)���� ������ �ʱ�ȭ���ִ� Ű����
		int[] score2 = new int[] {75, 85, 100};
		
		for(int j = 0; j < score2.length; j++) {
			System.out.println(score2[j]);
		}
		System.out.println("---------------------------");
		
		//3. new Ű����� ���̸� �����ϰ� �ʱ�ȭ
		//����Ÿ�Կ� ���� �ʱ�ȭ ���� �ٸ�
		int[] score3 = new int[3]; // ����, �Ǽ��� 0
		String[] str = new String[3]; // String�� null
		
		for(int k = 0; k < score3.length; k++) {
			System.out.println(score3[k]);
		}
		
		for(int h = 0; h < str.length; h++) {
			System.out.println(str[h]);
		}
		System.out.println("---------------------------");
		System.out.println(score3[0]); //0
		System.out.println("---------------------------");
		
		//�ʱ�ȭ�� �迭 ������ �� ����
		//�迭�� ��ҿ� ���� �� �Է�
		//for������ ��ĳ�ʳ� read.in���� ���� �Է��� �����ϴ�
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
