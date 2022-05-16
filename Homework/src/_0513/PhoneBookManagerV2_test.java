package _0513;

import java.util.Scanner;

public class PhoneBookManagerV2_test {

	public static String name;
	public static String phoneNumber;
	public static String birthDay;
	
	
	public static PhoneInfo_test[] phoneArr = new PhoneInfo_test[100];
	public static int count = 0;
	
	
	public static void showMenu() {
		System.out.println("--선택하세요--");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 데이터 수정");
		System.out.println("5. 데이터 전체 출력");
		System.out.println("6. 프로그램 종료");
	}
	
	public static void readData() {
		PhoneInfo_test phoneInfo_test = new PhoneInfo_test();
		
		phoneInfo_test.name = name;
		phoneInfo_test.phoneNumber = phoneNumber;
		phoneInfo_test.birthDay = birthDay;
		
		if(count == phoneArr.length) {
			System.out.println("더 이상 저장 못함");
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
		
		if(index == count - 1) { // index는 0부터 시작해서 -1 처리해서 맞춰줘야함
			phoneArr[index] = null; // 만약에 끝 부분이라고하면은 해당 값 찾은 부분을 삭제하니까 null로 데이터 주입
		} else {
			for(int j = index; j < count; j++) {
				phoneArr[j] = phoneArr[j + 1]; // 계속 찾으면서 비교하다가 해당 부분에 다음 데이터를 넣어주기
			}
		}
		count--; // 개수를 하나 삭제했으니까 총 카운트에서 하나 삭제
	}
	
	public static void update(String keyWord, Scanner sc) {
		int index = 0;
		for(int i = 0; i < count; i++) {
			if(keyWord.equals(phoneArr[i].name)) {
				index = i;
			}
		}
		System.out.print("이름 수정 : ");
		name = sc.nextLine();
		System.out.print("전화번호 수정 : ");
		phoneNumber = sc.nextLine();
		System.out.print("생년월일 수정 : ");
		birthDay = sc.nextLine();
		
		PhoneInfo_test pInfo = new PhoneInfo_test(name, phoneNumber, birthDay);
		phoneArr[index] = pInfo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
