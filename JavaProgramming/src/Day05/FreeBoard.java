package Day05;

public class FreeBoard implements Board, Reply{

	@Override
	//�����Խ��� �Խñ� ��� ��ȸ
	public void getBoardList() {
		// TODO Auto-generated method stub
		System.out.println("���� �Խ��� �Խñ� ��� ��ȸ");
		System.out.println("�� �������� ��ȸ ������ �Խñ��� ������ " + this.BOARD_COUNT + "���Դϴ�.");
		
	}

	@Override
	//�����Խ��� �Խñ� ���
	public void registBoard() {
		// TODO Auto-generated method stub
		System.out.println("���� �Խ��� �Խñ� ���");
	}

	@Override
	//�����Խ��� �Խñ� ����
	public void updateBoard() {
		// TODO Auto-generated method stub
		System.out.println("���� �Խ��� �Խñ� ����");
	}

	@Override
	//�����Խ��� �Խñ� ����
	public void deleteBoard() {
		// TODO Auto-generated method stub
		System.out.println("���� �Խ��� �Խñ� ����");
	}

	@Override
	//�����Խ��� �Խñۿ� ��� ���
	public void registReply() {
		// TODO Auto-generated method stub
		System.out.println("���� �����Խ��� �Խñۿ� ����� ��ϴ�.");
		
	}

	@Override
	//�����Խ��� �Խñ� ��� ����
	public void updateReply() {
		// TODO Auto-generated method stub
		System.out.println("���� �����Խ��� �Խñۿ� ����� �����մϴ�.");
	}

	@Override
	//�����Խ��� �Խñ� ��� ����
	public void deleteReply() {
		// TODO Auto-generated method stub
		System.out.println("��� ����");
	}

	@Override
	//�����Խ��� �Խñ� ��� ��� ��ȸ
	public void getReplyList() {
		// TODO Auto-generated method stub
		System.out.println("��� ��� ��ȸ");
	}

}
