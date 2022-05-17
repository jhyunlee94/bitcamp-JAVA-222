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
			System.out.println("�� �̻� ���� �� �� ����");
		} else {
			employeeArr[count++] = emp;
		}
	}
	
	public static void showMenu() {
		System.out.println("*** �޴� ���� ***");
		System.out.println("1. ������ ����");
		System.out.println("2. �ӽ��� ����");
		System.out.println("3. ����� ����");
		System.out.println("4. ��ü ���� ���");
		System.out.println("5. ���� ��� ���");
		System.out.println("6. ���α׷� ����");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String chk = "";
		
		while(true) {
			
			showMenu();
			
			System.out.println("���� >>");
			chk = sc.nextLine();
			
			if(chk.equals("6")) {
				System.out.println("���α׷� ����");
				break;
			} else if(chk.equals("1")) {
				System.out.println("������ �Է� ����");
				System.out.println("��� �Է� : ");
				no = sc.nextLine();
				System.out.println("�̸� �Է� : ");
				name = sc.nextLine();
				System.out.println("�޿� �Է� : ");
				pay = Integer.parseInt(sc.nextLine());
				System.out.println("���ʽ� �Է� : ");
				bonus = Integer.parseInt(sc.nextLine());
				
				RegularEmployee re = new RegularEmployee(no, name, pay, bonus);
				check(re);
			}else if (chk.equals("2")) {
				System.out.println("�ӽ��� ������ �Է� ����.");
				System.out.println("��� �Է� : ");
				no = sc.nextLine();
				System.out.println("�̸� �Է� : ");
				name = sc.nextLine();
				System.out.println("�ӱ� �Է� : ");
				pay = Integer.parseInt(sc.nextLine());
				System.out.println("���Ⱓ �Է� : ");
				hireYear = Integer.parseInt(sc.nextLine());
			
				TemporaryEmployee tw = 
						new TemporaryEmployee(no, name, pay, hireYear);
				
				check(tw);
			} else if (chk.equals("3")) {
				System.out.println("����� ������ �Է� ����.");
				System.out.println("��� �Է� : ");
				no = sc.nextLine();
				System.out.println("�̸� �Է� : ");
				name = sc.nextLine();
				System.out.println("�ӱ� �Է� : ");
				pay = Integer.parseInt(sc.nextLine());
				System.out.println("���Ⱓ �Է� : ");
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
