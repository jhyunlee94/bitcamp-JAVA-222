package Day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class _01_OutputStream {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		//FileOutputStream ��ü ���� �� ������ ����� ��ġ�� ���ϸ� ����
		//����½�Ʈ�� ��� �� ����ó�� �ʼ��� ����
		OutputStream os = new FileOutputStream("C:/lecture/java/test.db");
		
		byte[] arr = {10, 20, 30};
		
		//write(byte[] b) : �Ű������� �Էµ� ��� ����Ʈ ���
		os.write(arr);
		
		//flush() : ��� ���ۿ� �����ִ� ��� ����Ʈ ���
		os.flush();
		//close() : ��� ���� ����
		os.close();
	}

}
