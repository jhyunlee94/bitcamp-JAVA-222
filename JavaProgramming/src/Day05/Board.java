package Day05;

public interface Board {

	// ��� �ʵ�
	//�������̽����� �ʵ�� ����̱� ������ final Ű���带 ������ ���·� ����
	public int BOARD_COUNT = 10;
	
	//�Խñ� ��� ��ȸ �޼ҵ�
	//�������̽��� �߻�޼ҵ� abstract �� �� ���� ����
	//�ֳ� �������̽��� ��� �޼ҵ尡 �߻�޼ҵ�� ����Ǿ�� ��
	//�������̽����� �߻�޼ҵ��� ������ abstract Ű���带 ������ ���·� ����
	public void getBoardList();
	
	//�Խñ� ���
	public void registBoard();
	
	//�Խñ� ����
	public void updateBoard();
	
	//�Խñ� ����
	public void deleteBoard();
	
	//�������̽����� �޼ҵ� �����ϸ� ���� �߻���
	//�߻�޼ҵ�� �Ȱ���?
	
}
