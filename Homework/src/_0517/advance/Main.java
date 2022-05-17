package _0517.advance;

import java.util.Scanner;

import _0513.PhoneInfo;

public class Main {

	static String no;
	static String name; 
	static int pay;
	static int bonus;
	static int hireYear;
	static int workDay;
	
	public static Employee[] employeeArr = new Employee[100];
	public static int count = 0; // 저장된 사원 수
	
	
	public static void showMenu() {
		System.out.println("*** 메뉴 선택 ***");
		System.out.println("1. 정규직 저장");
		System.out.println("2. 임시직 저장");
		System.out.println("3. 계약직 저장");
		System.out.println("4. 전체 정보 출력");
		System.out.println("5. 월급 계산 출력");
		System.out.println("6. 프로그램 종료");
	}
	

	static boolean saveEmployee(Employee emp) {
		if(count < employeeArr.length) {
			employeeArr[count++] = emp;
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
			while(true) {
				
			showMenu();
			
			System.out.println("선택 : ");
			String chk = sc.nextLine();

			
			if(chk.equals("6")) {
				System.out.println("프로그램 종료!");
				break;
			} else if (chk.equals("1")) {
				System.out.println("정규직 데이터 입력 시작.");
				System.out.println("사번 입력 : ");
				no = sc.nextLine();
				System.out.println("이름 입력 : ");
				name = sc.nextLine();
				System.out.println("임금 입력 : ");
				pay = Integer.parseInt(sc.nextLine());
				System.out.println("보너스 입력 : ");
				bonus = Integer.parseInt(sc.nextLine());

				RegularWorker re = 
						new RegularWorker(no, name, pay, bonus);
				boolean isSave = saveEmployee(re);
				if(isSave)
					System.out.println("잘 저장되었습니다~");
				else
					System.out.println("더 이상 저장되지 않습니다!");
//				Employee r = new RegularWorker(no,name,salary,bonus);
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
			
				TemporaryWorker tw = 
						new TemporaryWorker(no, name, pay, hireYear);
				boolean isSave = saveEmployee(tw);
				if(isSave)
					System.out.println("잘 저장되었습니다~");
				else
					System.out.println("더 이상 저장되지 않습니다!");
//				
				
//				Employee t = new TemporaryWorker(no,name,salary,hireYear);
			}else if (chk.equals("3")) {
				System.out.println("계약직 데이터 입력 시작.");
				System.out.println("사번 입력 : ");
				no = sc.nextLine();
				System.out.println("이름 입력 : ");
				name = sc.nextLine();
				System.out.println("임금 입력 : ");
				pay = Integer.parseInt(sc.nextLine());
				System.out.println("고용기간 입력 : ");
				workDay = Integer.parseInt(sc.nextLine());


				ContractWorker cw = 
						new ContractWorker(no, name, pay, workDay);
				boolean isSave = saveEmployee(cw);
				if(isSave)
					System.out.println("잘 저장되었습니다~");
				else
					System.out.println("더 이상 저장되지 않습니다!");
//				
				
//				Employee t = new TemporaryWorker(no,name,salary,workDay);
			} else if (chk.equals("4")) {
				for(int i = 0; i < count; i++) {
					employeeArr[i].showEmployeeInfo();
					System.out.println("--------------------");
				}
				System.out.println("총 " + count + "건 출력됐습니다.");
			} else if (chk.equals("5")){ 
				System.out.println("월급 계산 출력");
				for(int i=0;i<count;i++) {
					employeeArr[i].showMonthPayInfo();
					System.out.println();
			}
		}
	}

}
}
