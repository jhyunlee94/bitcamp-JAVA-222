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
	public static int count = 0; // ����� ��� ��
	
	
	public static void showMenu() {
		System.out.println("*** �޴� ���� ***");
		System.out.println("1. ������ ����");
		System.out.println("2. �ӽ��� ����");
		System.out.println("3. ����� ����");
		System.out.println("4. ��ü ���� ���");
		System.out.println("5. ���� ��� ���");
		System.out.println("6. ���α׷� ����");
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
			
			System.out.println("���� : ");
			String chk = sc.nextLine();

			
			if(chk.equals("6")) {
				System.out.println("���α׷� ����!");
				break;
			} else if (chk.equals("1")) {
				System.out.println("������ ������ �Է� ����.");
				System.out.println("��� �Է� : ");
				no = sc.nextLine();
				System.out.println("�̸� �Է� : ");
				name = sc.nextLine();
				System.out.println("�ӱ� �Է� : ");
				pay = Integer.parseInt(sc.nextLine());
				System.out.println("���ʽ� �Է� : ");
				bonus = Integer.parseInt(sc.nextLine());

				RegularWorker re = 
						new RegularWorker(no, name, pay, bonus);
				boolean isSave = saveEmployee(re);
				if(isSave)
					System.out.println("�� ����Ǿ����ϴ�~");
				else
					System.out.println("�� �̻� ������� �ʽ��ϴ�!");
//				Employee r = new RegularWorker(no,name,salary,bonus);
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
			
				TemporaryWorker tw = 
						new TemporaryWorker(no, name, pay, hireYear);
				boolean isSave = saveEmployee(tw);
				if(isSave)
					System.out.println("�� ����Ǿ����ϴ�~");
				else
					System.out.println("�� �̻� ������� �ʽ��ϴ�!");
//				
				
//				Employee t = new TemporaryWorker(no,name,salary,hireYear);
			}else if (chk.equals("3")) {
				System.out.println("����� ������ �Է� ����.");
				System.out.println("��� �Է� : ");
				no = sc.nextLine();
				System.out.println("�̸� �Է� : ");
				name = sc.nextLine();
				System.out.println("�ӱ� �Է� : ");
				pay = Integer.parseInt(sc.nextLine());
				System.out.println("���Ⱓ �Է� : ");
				workDay = Integer.parseInt(sc.nextLine());


				ContractWorker cw = 
						new ContractWorker(no, name, pay, workDay);
				boolean isSave = saveEmployee(cw);
				if(isSave)
					System.out.println("�� ����Ǿ����ϴ�~");
				else
					System.out.println("�� �̻� ������� �ʽ��ϴ�!");
//				
				
//				Employee t = new TemporaryWorker(no,name,salary,workDay);
			} else if (chk.equals("4")) {
				for(int i = 0; i < count; i++) {
					employeeArr[i].showEmployeeInfo();
					System.out.println("--------------------");
				}
				System.out.println("�� " + count + "�� ��µƽ��ϴ�.");
			} else if (chk.equals("5")){ 
				System.out.println("���� ��� ���");
				for(int i=0;i<count;i++) {
					employeeArr[i].showMonthPayInfo();
					System.out.println();
			}
		}
	}

}
}
