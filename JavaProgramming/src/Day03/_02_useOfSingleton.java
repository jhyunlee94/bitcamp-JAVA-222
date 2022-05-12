package Day03;

public class _02_useOfSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�̱��濡�� ��ü�� �ϳ������Ǿ��ֱ⿡ �����Ͽ�������
		//�̹� Singleton Ŭ������ �ϳ��� ��ü�� �����Ǿ� �ֱ� ������ ������ ����
//		Singleton s1 = new Singleton();
		
		//Singleton Ŭ������ �����Ǿ� �ִ� ��ü�� ��ȯ�޾� ���
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		
		//���� �ٸ� ��ü���� �����Ǿ� ����
		Car car1 = new Car();
		Car car2 = new Car();
		
		
		System.out.println(s1); // s1,s2 �ּҰ��� ��ü �ּҰ��� ����
		System.out.println(s2); //
		System.out.println("--------------------");
		
		if(s1 == s2) {
			System.out.println("���� singleton ��ü");
		}else {
			System.out.println("�ٸ� singleton ��ü");
		}
		
		System.out.println("--------------------");
		
		if(car1 == car2) {
			System.out.println("���� car ��ü");
		}else {
			System.out.println("�ٸ� car ��ü");
		}
		
	}

}
