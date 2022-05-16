package Day05;

public class _03_multinheritOfInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//자유게시판 객체 생성
		//다중 상속 시 하나의 객체로 여러 개의 기능 사용가능
		FreeBoard freeBoard = new FreeBoard();
//		Board board1 = new Board(); //추상클래스는 자기 자신을 객체 생성 못함
		// 반드시 아래와 같이 주입시켜줘야함
		
	
		//자유게시판 객체의 게시판 기능 사용
		Board board = freeBoard;
		board.registBoard();
		board.updateBoard();
		board.deleteBoard();
		board.getBoardList();
		System.out.println("-----------------------\n");
		
		//자유게시판 객체의 답글 기능 사용
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
