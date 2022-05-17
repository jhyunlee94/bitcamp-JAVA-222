package _0517.advance;

import java.util.Scanner;

public class Main_test {
	
	static String no;
	static String name;
	static int pay;
	static int bonus;
	
	public static E_test[] employeeArr = new E_test[100];
	public static int count = 0;
	public static void test(E_test emp) {
		if(count == employeeArr.length) {
			System.out.println("더 이상 저장 못함");
		} else {
			employeeArr[count++] = emp;
		}
	}
	public static void showMenu() {
		System.out.println("*** 메뉴 선택 ***");
		System.out.println("1. 정규직 저장");
		System.out.println("2. 임시직 저장");
		System.out.println("3. 계약직 저장");
		System.out.println("4. 전체 정보 출력");
		System.out.println("5. 월급 계산 출력");
		System.out.println("6. 프로그램 종료");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		
		while(true) {
			showMenu();
			System.out.println("선택 : ");
			String chk = sc.nextLine();
			if(chk.equals("6")){
				System.out.println("프로그램 종료");
				break;
			}else if(chk.equals("1")) {
				System.out.println("데이터 입력을 시작");
				System.out.println("사번 입력 : ");
				no = sc.nextLine();
				System.out.println("이름 입력 : ");
				name = sc.nextLine();
				System.out.println("급여 입력 : ");
				pay = Integer.parseInt(sc.nextLine());
				System.out.println("보너스 입력 : ");
				bonus = Integer.parseInt(sc.nextLine());
				
				R_test rt = new R_test(no,name, pay, bonus);
				
				test(rt);
			} else if(chk.equals("4")) {
				for(int i = 0; i < count; i++) {
					employeeArr[i].showEmployeeInfo();
					System.out.println("------------");
				}
				System.out.println("총 " + count + "건 출력됐습니다.");
			} else if(chk.equals("5")) {
				System.out.println("월급 계산 출력");
				for (int i = 0; i < count; i++) {
					employeeArr[i].showMonthPayInfo();
					System.out.println();
				}
			}
		}
	}

}
