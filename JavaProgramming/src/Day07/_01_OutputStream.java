package Day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class _01_OutputStream {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		//FileOutputStream 객체 생성 시 파일이 저장될 위치와 파일명 지정
		//입출력스트림 사용 시 예외처리 필수로 동반
		OutputStream os = new FileOutputStream("C:/lecture/java/test.db");
		
		byte[] arr = {10, 20, 30};
		
		//write(byte[] b) : 매개변수로 입력된 모든 바이트 출력
		os.write(arr);
		
		//flush() : 출력 버퍼에 남아있는 모든 바이트 출력
		os.flush();
		//close() : 출력 버퍼 닫음
		os.close();
	}

}
