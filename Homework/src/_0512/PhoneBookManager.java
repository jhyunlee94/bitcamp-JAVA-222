package _0512;

import java.util.Scanner;

public class PhoneBookManager {

	
	//전역변수 : 클래스가 실행되는 동안 계속 메모리에 남아있음
	public static PhoneInfo phoneInfo = new PhoneInfo();

	//지역변수 : 메소드나 제어문, 조건문 안에 선언된 변수
	//		   메소드나 제어문, 조건문이 종료되면 메모리에서 삭제됨
	// for(int i = 0; i < 10; i++) -----> i는 지역변수라 for문종료 시 삭제됨
	
	public static void showMenu() {
		System.out.println("--선택하세요--");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
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
			System.out.println("선택 : "+start);
			System.out.println("이름 : ");
			name = sc.nextLine();
			System.out.println("전화번호 : ");
			phoneNumber = sc.nextLine();
			System.out.println("생년월일 : ");
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
		
		// nextLine 이랑 nextInt 혼용해서 사용하면 안됨
		
		while(true) {
			showMenu();

			if(sc.nextLine().equals(start)) {
				System.out.println("선택 : "+start);
				System.out.println("이름 : ");
				name = sc.nextLine();
				System.out.println("전화번호 : ");
				phoneNumber = sc.nextLine();
				System.out.println("생년월일 : ");
				birthDay = sc.nextLine();

				//readData(name,phoneNumber,birthDay);
				phoneInfo.setName(name);
				phoneInfo.setPhoneNumber(phoneNumber);
				phoneInfo.setBirthday(birthDay);
				
		      //	test();
				System.out.println("<입력된 정보 출력>");
				System.out.println("name : " +phoneInfo.getName());
				System.out.println("phone : "+phoneInfo.getPhoneNumber());
				System.out.println("birth : "+phoneInfo.getBirthday());
				continue;
			}
			
			if(sc.nextLine().equals(end)) {
				System.out.println("종료함");
				break;
			}
		}
		

	}

}
