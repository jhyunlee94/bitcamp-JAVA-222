package Day07;

import java.io.FileInputStream;
import java.io.InputStream;

public class _02_InputStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("C:/lecture/java/test.db");

		while(true) {
			int data = is.read(); // 하나씩 읽어서 데이터에 넣어줌
			
			
			//read가 -1이되면 파일에 끝에 도달했다는 뜻
			//read() 메소드가 -1 반환 시, 파일에 끝에 도달
			if(data == -1) {
				break;
			}
			
			System.out.println(data);
		}
		
		is.close();
	}

}
