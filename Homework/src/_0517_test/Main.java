package _0517_test;

import java.util.Scanner;

import _0517.advance.ContractWorker;
import _0517.advance.TemporaryWorker;

public class Main {
	static String no;
	static String name;
	static int pay;
	static int bonus;
	static int hireYear;
	static int workDay;
	
	static Employee[] employeeArr = new Employee[100];
	static int count;
	
	public static void check(Employee emp) {
		if(count == employeeArr.length) {
			System.out.println("더 이상 저장 할 수 없음");
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
		String chk = "";
		
		while(true) {
			
			showMenu();
			
			System.out.println("선택 >>");
			chk = sc.nextLine();
			
			if(chk.equals("6")) {
				System.out.println("프로그램 종료");
				break;
			} else if(chk.equals("1")) {
				System.out.println("데이터 입력 시작");
				System.out.println("사번 입력 : ");
				no = sc.nextLine();
				System.out.println("이름 입력 : ");
				name = sc.nextLine();
				System.out.println("급여 입력 : ");
				pay = Integer.parseInt(sc.nextLine());
				System.out.println("보너스 입력 : ");
				bonus = Integer.parseInt(sc.nextLine());
				
				RegularEmployee re = new RegularEmployee(no, name, pay, bonus);
				check(re);
			}else if (chk.equals("2")) {
				System.out.println("임시직 데이터 입력 시작.");
				System.out.println("사번 입력 : ");
				no = sc.nextLine();
				System.out.println("이름 입력 : ");
				name = sc.nextLine();
				System.out.println("임금 입력 : ");
				pay = Integer.parseInt(sc.nextLine());
				System.out.println("고용기간 입력 : ");
				hireYear = Integer.parseInt(sc.nextLine());
			
				TemporaryEmployee tw = 
						new TemporaryEmployee(no, name, pay, hireYear);
				
				check(tw);
			} else if (chk.equals("3")) {
				System.out.println("계약직 데이터 입력 시작.");
				System.out.println("사번 입력 : ");
				no = sc.nextLine();
				System.out.println("이름 입력 : ");
				name = sc.nextLine();
				System.out.println("임금 입력 : ");
				pay = Integer.parseInt(sc.nextLine());
				System.out.println("고용기간 입력 : ");
				workDay = Integer.parseInt(sc.nextLine());


				ContractEmployee cw = 
						new ContractEmployee(no, name, pay, workDay);
				
				check(cw);
	
			} else if(chk.equals("4")) {
				for(int i = 0; i < count; i++) {
					employeeArr[i].showEmployeeInfo();
				}
			} else if(chk.equals("5")) {
				for(int i = 0; i < count; i++) {
					employeeArr[i].showEmployeePayInfo();
					System.out.println();
				}
			}
		}
		
	}

}
