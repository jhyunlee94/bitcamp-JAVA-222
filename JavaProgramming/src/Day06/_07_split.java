package Day06;

public class _07_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "010-1111-2222";
		String[] strArr = str1.split("-");
		
		
		// ���� ���� ���°� ���ڸ� ������ , �� - �� ���ü����ֱ⿡
		// �̷��� , �� -�� �����ϰ�
		// �ٽ� String�� ������ �۾��� �����ϰ� DB�� ����������Ҷ�
		// �����ϴ� �κж� ���� ���� ��
		
		for(int i = 0 ; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

}
