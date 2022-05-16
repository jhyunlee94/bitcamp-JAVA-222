package Day05;

public class _08_tryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String str1 = "100";
			String str2 = "bit100";
			
			Integer.parseInt(str1);
			Integer.parseInt(str2);
			
		//범용적으로 예외처리할 경우 최상위 예외처리 클래스인 
		//Exception 클래스를 이용
		}catch(Exception e) {
			//try 블록에서 예외발생 시 catch 블록 실행
			e.printStackTrace();
		}
		
		
		try {
			int[] intArr = new int[3];
			
			int num = intArr[3];
			
		//예외에 대한 상세 정보확인하고 싶을때
		//다중 catch블록을 이용하여 예외처리 상세화
		}catch(ArrayIndexOutOfBoundsException ex) {
			//printStackTrace() : 예외내용 표출해주는 메소드
			//현업으로 가면은 이게 보안으로 걸린다고 잘 쓰지 못하게해요
			//printStackTrace() 예외내용 모두 표출되기 때문에 보안에 좋지않음
			
			//syso(ex.toString())으로 에러 내용을 표출하는게 더 좋은 코드임
			System.out.println(ex.toString());
			ex.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(ClassCastException e) {
			e.printStackTrace();
		}finally {
			//예외가 발생하던 발생하지 않던 무조건 실행
			System.out.println("프로그램 재시작하세요.");
		}
	}

}
