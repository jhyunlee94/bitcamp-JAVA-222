package _0511;

public class Middle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		4. ó���� ���࿡ �ñ� ���� 10000���Դϴ�
		�ݸ��� �� 10%�Դϴ�
		�������ڷ� ������� �� 10���� �󸶰� �ɱ��?

		�ܸ����� ������
		 �����հ�(S)=����(P) x ( 1+ ����(i) x ���Ⱓ(n) )

		������ ������
		�����հ�(S) = ���� (P) x ( 1 + ����(i) ) ^���Ⱓ(n)
		*/
		
		//���� 10000��
//		double money = 1000000;
//		
//		//�ݸ� 10%
//		double rate = 0.1;
//		
//		//��ġ 10��
//		int year = 10;
//		

//		for(int i = 1; i<=year; i++) {
//			money = money + (money * rate);
//		//	System.out.println(money+"��");
//		}
//		
		double money = 10000;

		for(int i = 1; i <=10; i++) {
			money = money + (money * 0.1);
		}
		
		
		System.out.println(money+"��");
	}
}

