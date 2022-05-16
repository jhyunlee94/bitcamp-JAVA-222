package Day05;

public interface Board {

	// 상수 필드
	//인터페이스에서 필드는 상수이기 때문에 final 키워드를 생략한 상태로 선언
	public int BOARD_COUNT = 10;
	
	//게시글 목록 조회 메소드
	//인터페이스는 추상메소드 abstract 등 다 생략 가능
	//왜냐 인터페이스는 모든 메소드가 추상메소드로 선언되어야 함
	//인터페이스에서 추상메소드의 선언은 abstract 키워드를 생략한 상태로 선언
	public void getBoardList();
	
	//게시글 등록
	public void registBoard();
	
	//게시글 수정
	public void updateBoard();
	
	//게시글 삭제
	public void deleteBoard();
	
	//인터페이스에서 메소드 구현하면 에러 발생함
	//추상메소드랑 똑같죠?
	
}
