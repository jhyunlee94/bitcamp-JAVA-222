package _0513;

import java.util.Scanner;

public class PhoneBookManagerV2_test {

	public static String name;
	public static String phoneNumber;
	public static String birthDay;
	
	
	public static PhoneInfo_test[] phoneArr = new PhoneInfo_test[100];
	public static int count = 0;
	
	
	public static void showMenu() {
		System.out.println("--�����ϼ���--");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ������ ����");
		System.out.println("5. ������ ��ü ���");
		System.out.println("6. ���α׷� ����");
	}
	
	public static void readData() {
		PhoneInfo_test phoneInfo_test = new PhoneInfo_test();
		
		phoneInfo_test.name = name;
		phoneInfo_test.phoneNumber = phoneNumber;
		phoneInfo_test.birthDay = birthDay;
		
		if(count == phoneArr.length) {
			System.out.println("�� �̻� ���� ����");
		}else {
			phoneArr[count++] = phoneInfo_test;
		}
	}
	
	public static void search(String keyWord) {
		for(int i = 0; i < count; i++) {
			if(keyWord.equals(phoneArr[i].name)) {
				phoneArr[i].showPhoneInfo();
				System.out.println("-------------------");
			}
			
		}
	}
	
	public static void delete(String keyWord) {
		int index = 0;
		for(int i = 0; i< count; i++) {
			if(keyWord.equals(phoneArr[i].name)) {
				index = i;
			}
		}
		
		if(index == count - 1) { // index�� 0���� �����ؼ� -1 ó���ؼ� ���������
			phoneArr[index] = null; // ���࿡ �� �κ��̶���ϸ��� �ش� �� ã�� �κ��� �����ϴϱ� null�� ������ ����
		} else {
			for(int j = index; j < count; j++) {
				phoneArr[j] = phoneArr[j + 1]; // ��� ã���鼭 ���ϴٰ� �ش� �κп� ���� �����͸� �־��ֱ�
			}
		}
		count--; // ������ �ϳ� ���������ϱ� �� ī��Ʈ���� �ϳ� ����
	}
	
	public static void update(String keyWord, Scanner sc) {
		int index = 0;
		for(int i = 0; i < count; i++) {
			if(keyWord.equals(phoneArr[i].name)) {
				index = i;
			}
		}
		System.out.print("�̸� ���� : ");
		name = sc.nextLine();
		System.out.print("��ȭ��ȣ ���� : ");
		phoneNumber = sc.nextLine();
		System.out.print("������� ���� : ");
		birthDay = sc.nextLine();
		
		PhoneInfo_test pInfo = new PhoneInfo_test(name, phoneNumber, birthDay);
		phoneArr[index] = pInfo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
