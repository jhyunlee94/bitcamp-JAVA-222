package Day07;

import java.io.FileWriter;
import java.io.Writer;

public class _03_Writer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Writer writer = new FileWriter("C:/lecture/java/test.txt");

		String str = "hello java";
		
		//write(char[] c, int index, int length) : �Ű������� �Էµ� �迭�� index��° ���
		//										   length�������� ��� ���� ���
		writer.write(str, 6, 4);
		
		//flush() : ���ۿ� �����ִ� ���� ��� ���
		writer.flush();
		//close() : ���� ����
		writer.close();
	}

}
