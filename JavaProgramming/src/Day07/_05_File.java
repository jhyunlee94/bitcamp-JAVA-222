package Day07;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _05_File {
	//File Ŭ���� ������ ����ó���� �׻� �������
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File dir = new File("C:/lecture/java/test");
		File file1 = new File("C:/lecture/java/test/file1.txt");
		File file2 = new File("C:/lecture/java/test/file2.txt");
		File file3 = new File("C:/lecture/java/test/file3.txt");
		
		if(dir.exists() == false) {
			dir.mkdir(); // false�� ������ ������
		}
		
		if(file1.exists() == false) {
			file1.createNewFile();  // false�� ���ο� ���� ������
		}
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		if(file3.exists() == false) {
			file3.createNewFile();
		}
		
		//���߿� was�� ���µ� ������ ����θ� �������� �����س��⶧����
		//�������� File�� �������ְ�
		//������ �����Ҷ� �̸��� 
		//�������� �̸��� ����ϴ°� �ƴ϶� ��¥�� �ٸ� ���ϸ����� ��ȯ�ؼ� ����ϱ⿡
		//���ʰ��� �ѹ� �� ���� �帮�ڽ��ϴ�.
		
		File[] fileArr = dir.listFiles(); // ������ ���ȭ
		
		System.out.println("�ð�\t\t\t����\t\tũ��\t�̸�");
		System.out.println("---------------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		for(File file : fileArr) { //fileArr���� �ϳ� �� ������ ����� ���ش�
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
