package _0513;


public class BaseBallMenu {

	BaseBallMain main = new BaseBallMain(); //���ο� static Random, static Scanner �޾ƿ�
	
	static int[] inputArr = new int[3]; // �Է� 3�� ���� �迭
	
	public void menuDisplay() {
	
		//�޴��� ����ϴ� ����
		System.out.println();
		System.out.println("1��° ���� �Է� >>");
		inputArr[0] = main.sc.nextInt();
		System.out.println("2��° ���� �Է� >>");
		inputArr[1] = main.sc.nextInt();
		System.out.println("3��° ���� �Է� >>");
		inputArr[2] = main.sc.nextInt();
		}
}
