package Day05;

public class _03_multinheritOfInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�����Խ��� ��ü ����
		//���� ��� �� �ϳ��� ��ü�� ���� ���� ��� ��밡��
		FreeBoard freeBoard = new FreeBoard();
//		Board board1 = new Board(); //�߻�Ŭ������ �ڱ� �ڽ��� ��ü ���� ����
		// �ݵ�� �Ʒ��� ���� ���Խ��������
		
	
		//�����Խ��� ��ü�� �Խ��� ��� ���
		Board board = freeBoard;
		board.registBoard();
		board.updateBoard();
		board.deleteBoard();
		board.getBoardList();
		System.out.println("-----------------------\n");
		
		//�����Խ��� ��ü�� ��� ��� ���
		Reply reply = freeBoard;
		reply.registReply();
		reply.updateReply();
		reply.deleteReply();
		reply.getReplyList();
		System.out.println("-----------------------\n");
		
		Board board1 = new NoticeBoard();
		
		board1.getBoardList();
		board1.registBoard();
		board1.updateBoard();
		board1.deleteBoard();
		
	}

}
