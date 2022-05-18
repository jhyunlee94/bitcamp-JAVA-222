package Day07;

import java.io.FileWriter;
import java.io.Writer;

public class _03_Writer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Writer writer = new FileWriter("C:/lecture/java/test.txt");

		String str = "hello java";
		
		//write(char[] c, int index, int length) : 매개변수로 입력된 배열의 index번째 요소
		//										   length개까지의 모든 문자 출력
		writer.write(str, 6, 4);
		
		//flush() : 버퍼에 남아있는 문자 모두 출력
		writer.flush();
		//close() : 버퍼 닫음
		writer.close();
	}

}
