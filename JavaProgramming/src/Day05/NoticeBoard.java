package Day05;

public class NoticeBoard implements Board{
	
	@Override
	//�������װԽ��� �Խñ� ��� ��ȸ
	public void getBoardList() {
		// TODO Auto-generated method stub
		System.out.println("�������� �Խ��� �Խñ� ��� ��ȸ");
	}

	@Override
	//�������װԽ��� �Խñ� ���
	public void registBoard() {
		// TODO Auto-generated method stub
		System.out.println("�������� �Խ��� �Խñ� ���");
		System.out.println("�������� �Խñ� ��� ��, ���� ÷��");
	}

	@Override
	//�������װԽ��� �Խñ� ����
	public void updateBoard() {
		// TODO Auto-generated method stub
		System.out.println("�������� �Խ��� �Խñ� ����");
		System.out.println("�������� �Խñ� ���� ��, ÷������ ����");
	}

	@Override
	//�������װԽ��� �Խñ� ����
	public void deleteBoard() {
		// TODO Auto-generated method stub
		System.out.println("�������� �Խ��� �Խñ� ����");
		System.out.println("�������� �Խñ� ��� ��, ÷������ ����");
	}
}
