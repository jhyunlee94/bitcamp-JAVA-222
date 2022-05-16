package Day05;

public class FreeBoard implements Board, Reply{

	@Override
	//자유게시판 게시글 목록 조회
	public void getBoardList() {
		// TODO Auto-generated method stub
		System.out.println("자유 게시판 게시글 목록 조회");
		System.out.println("한 페이지에 조회 가능한 게시글의 개수는 " + this.BOARD_COUNT + "개입니다.");
		
	}

	@Override
	//자유게시판 게시글 등록
	public void registBoard() {
		// TODO Auto-generated method stub
		System.out.println("자유 게시판 게시글 등록");
	}

	@Override
	//자유게시판 게시글 수정
	public void updateBoard() {
		// TODO Auto-generated method stub
		System.out.println("자유 게시판 게시글 수정");
	}

	@Override
	//자유게시판 게시글 삭제
	public void deleteBoard() {
		// TODO Auto-generated method stub
		System.out.println("자유 게시판 게시글 삭제");
	}

	@Override
	//자유게시판 게시글에 답글 등록
	public void registReply() {
		// TODO Auto-generated method stub
		System.out.println("현재 자유게시판 게시글에 답글을 답니다.");
		
	}

	@Override
	//자유게시판 게시글 답글 수정
	public void updateReply() {
		// TODO Auto-generated method stub
		System.out.println("현재 자유게시판 게시글에 답글을 수정합니다.");
	}

	@Override
	//자유게시판 게시글 답글 삭제
	public void deleteReply() {
		// TODO Auto-generated method stub
		System.out.println("답글 삭제");
	}

	@Override
	//자유게시판 게시글 답글 목록 조회
	public void getReplyList() {
		// TODO Auto-generated method stub
		System.out.println("답글 목록 조회");
	}

}
