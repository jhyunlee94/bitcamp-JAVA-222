package Day02;

public class _02_copyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. for�� �̿��� �迭 ����
		//�迭�� ��Ұ��� ���� �����ϴ� ���
		int[] score1 = {100,90,80};
		int[] score2 = new int[5];
		
		for(int i = 0; i < score1.length; i++) {
			score2[i] = score1[i];
			System.out.println(score2[i]);
		}
		System.out.println("---------------------------");
	
	
		//2. arraycopy() �޼ҵ� �̿��� �迭�� ����
		String[] str1 = {"java", "hello"};
	    String[] str2 = new String[3]; 
	     
	    for(int j = 0; j < str1.length; j++) {
	    	str2[j] = str1[j];
	    	System.out.println(str2[j]);
	    }
	    
		System.out.println("---------------------------");
		//System.arraycopy(���� �迭�� �̸�, ���縦 ������ �ε���,
		//����� ����� �迭 �̸�
		//(�� �迭�� �̸�), �� �迭�� ���簡 ���۵Ǵ� �ε�����, ����);

	    System.arraycopy(str1, 0, str2, 0, str1.length);
	    
	    for(int h = 0; h < str2.length; h++) {
	    	System.out.println(str2[h]);
	    }
	    
		System.out.println("---------------------------");
	}
	

}
