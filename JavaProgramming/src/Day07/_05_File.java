package Day07;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _05_File {
	//File 클래스 쓸때도 예외처리를 항상 해줘야함
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File dir = new File("C:/lecture/java/test");
		File file1 = new File("C:/lecture/java/test/file1.txt");
		File file2 = new File("C:/lecture/java/test/file2.txt");
		File file3 = new File("C:/lecture/java/test/file3.txt");
		
		if(dir.exists() == false) {
			dir.mkdir(); // false면 폴더를 만들어라
		}
		
		if(file1.exists() == false) {
			file1.createNewFile();  // false면 새로운 파일 만들어라
		}
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		if(file3.exists() == false) {
			file3.createNewFile();
		}
		
		//나중에 was를 쓰는데 서버에 상대경로를 만들어놓고 저정해놓기때문에
		//서버에서 File을 지정해주고
		//파일을 저장할때 이름도 
		//직접적인 이름을 사용하는게 아니라 날짜나 다른 파일명으로 변환해서 써야하기에
		//웹쪽갈때 한번 더 설명 드리겠습니다.
		
		File[] fileArr = dir.listFiles(); // 파일을 목록화
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("---------------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		for(File file : fileArr) { //fileArr에서 하나 씩 꺼내서 출력을 해준다
			System.out.print(sdf.format(new Date(file.lastModified()))); 
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
			
		}
	}

}
