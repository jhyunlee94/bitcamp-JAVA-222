package Day07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class _04_Reader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Reader reader = new FileReader("C:/lecture/java/test.txt");
		
		while(true) {
			int data = reader.read(); // int로 받고 출력할때만 char로 형변환하겠다
			
			if(data == -1) {
				break;
			}
			
			System.out.println((char)data);
		}
		reader.close();
	}

}
