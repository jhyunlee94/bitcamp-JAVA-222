package Day05;

public class NoticeBoard implements Board{
	
	@Override
	//공지사항게시판 게시글 목록 조회
	public void getBoardList() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시판 게시글 목록 조회");
	}

	@Override
	//공지사항게시판 게시글 등록
	public void registBoard() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시판 게시글 등록");
		System.out.println("공지사항 게시글 등록 시, 파일 첨부");
	}

	@Override
	//공지사항게시판 게시글 수정
	public void updateBoard() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시판 게시글 수정");
		System.out.println("공지사항 게시글 수정 시, 첨부파일 수정");
	}

	@Override
	//공지사항게시판 게시글 삭제
	public void deleteBoard() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시판 게시글 삭제");
		System.out.println("공지사항 게시글 등록 시, 첨부파일 삭제");
	}
}
