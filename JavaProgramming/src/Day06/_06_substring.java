package Day06;

public class _06_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "111111-2222222";
		
		//�ε��� 0~6������ ���ڿ� �ڸ�
		String first = str1.substring(0,6);
		//�ε��� 7���� ������ ���ڿ� �ڸ�
		String second = str1.substring(7);

		System.out.println(first);
		System.out.println(second);
	}

}
