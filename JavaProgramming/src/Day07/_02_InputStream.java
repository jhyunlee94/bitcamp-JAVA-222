package Day07;

import java.io.FileInputStream;
import java.io.InputStream;

public class _02_InputStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("C:/lecture/java/test.db");

		while(true) {
			int data = is.read(); // �ϳ��� �о �����Ϳ� �־���
			
			
			//read�� -1�̵Ǹ� ���Ͽ� ���� �����ߴٴ� ��
			//read() �޼ҵ尡 -1 ��ȯ ��, ���Ͽ� ���� ����
			if(data == -1) {
				break;
			}
			
			System.out.println(data);
		}
		
		is.close();
	}

}
