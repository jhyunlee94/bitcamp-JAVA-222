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
			System.out.println("�� �̻� ���� ����");
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

		
		while(true) {
			showMenu();
			System.out.println("���� : ");
			String chk = sc.nextLine();
			if(chk.equals("6")){
				System.out.println("���α׷� ����");
				break;
			}else if(chk.equals("1")) {
				System.out.println("������ �Է��� ����");
				System.out.println("��� �Է� : ");
				no = sc.nextLine();
				System.out.println("�̸� �Է� : ");
				name = sc.nextLine();
				System.out.println("�޿� �Է� : ");
				pay = Integer.parseInt(sc.nextLine());
				System.out.println("���ʽ� �Է� : ");
				bonus = Integer.parseInt(sc.nextLine());
				
				R_test rt = new R_test(no,name, pay, bonus);
				
				test(rt);
			} else if(chk.equals("4")) {
				for(int i = 0; i < count; i++) {
					employeeArr[i].showEmployeeInfo();
					System.out.println("------------");
				}
				System.out.println("�� " + count + "�� ��µƽ��ϴ�.");
			} else if(chk.equals("5")) {
				System.out.println("���� ��� ���");
				for (int i = 0; i < count; i++) {
					employeeArr[i].showMonthPayInfo();
					System.out.println();
				}
			}
		}
	}

}
