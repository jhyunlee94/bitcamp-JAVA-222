package _0512;

import java.util.Scanner;

public class PhoneBookManager {

	static PhoneInfo phoneInfo = new PhoneInfo();

	public static void showMenu() {
		System.out.println("--�����ϼ���--");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
	}
	
	public static void readData(String name, String phoneNumber, String birthDay) {
		
		PhoneInfo phoneInfo = new PhoneInfo(name, phoneNumber, birthDay);
		
		phoneInfo.setName(name);
		phoneInfo.setPhoneNumber(phoneNumber);
		phoneInfo.setBirthday(birthDay);
	}
	
	public static void test() {
		
		Scanner sc = new Scanner(System.in);
		String start = "1";
		String end = "2";
		String name="";
		String phoneNumber="";
		String birthDay="";
		
		if(sc.nextLine().equals(start)) {
			System.out.println("���� : "+start);
			System.out.println("�̸� : ");
			name = sc.nextLine();
			System.out.println("��ȭ��ȣ : ");
			phoneNumber = sc.nextLine();
			System.out.println("������� : ");
			birthDay = sc.nextLine();

			//readData(name,phoneNumber,birthDay);
			phoneInfo.setName(name);
			phoneInfo.setPhoneNumber(phoneNumber);
			phoneInfo.setBirthday(birthDay);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String start = "1";
		String end = "2";
		String name="";
		String phoneNumber="";
		String birthDay="";
		
		PhoneInfo phoneInfo = new PhoneInfo();
		
		while(true) {
			showMenu();

			if(sc.nextLine().equals(start)) {
				System.out.println("���� : "+start);
				System.out.println("�̸� : ");
				name = sc.nextLine();
				System.out.println("��ȭ��ȣ : ");
				phoneNumber = sc.nextLine();
				System.out.println("������� : ");
				birthDay = sc.nextLine();

				//readData(name,phoneNumber,birthDay);
				phoneInfo.setName(name);
				phoneInfo.setPhoneNumber(phoneNumber);
				phoneInfo.setBirthday(birthDay);
				
		      //	test();
				System.out.println("<�Էµ� ���� ���>");
				System.out.println("name : " +phoneInfo.getName());
				System.out.println("phone : "+phoneInfo.getPhoneNumber());
				System.out.println("birth : "+phoneInfo.getBirthday());
				continue;
			}
			
			if(sc.nextLine().equals(end)) {
				System.out.println("������");
				break;
			}
		}
		

	}

}
