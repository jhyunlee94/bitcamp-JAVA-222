package _0511;

public class Middle3_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�𸣰���

		int[] num = new int[20]; // ����ڷκ��� �Է¹��� �迭
		int[] num1 = new int[20]; //�����ؼ� ä�� �迭 
		int j=0,k=1;
		for(int i =0; i<num.length; i++) {
			num[i] = (int)(Math.random() *101);
		}
		
		for(int i=0; i<num.length; i++) { 
			if(num[i]%2==1) { // Ȧ���� �տ������� ����
				num1[j]=num[i]; //j���� ���
				j++;
			}else { // ¦���� �ڿ������� ���� 
				num1[num.length-k] = num[i];
				k++;
			}
		}
		
		for(int i =0; i<num.length; i++) {
			System.out.print(num1[i] + "\t");
		}
	}
}
