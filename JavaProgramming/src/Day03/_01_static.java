package Day03;

public class _01_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� ���(�Ӽ�) ���
		//��ü �������� ��� ����
		// Car car = new Car(); ��ü���� ���� Ŭ������ ���(�Ӽ��� �޼ҵ�)�� ����
		//�ϴ°� static 
		//static = heap �޸𸮿� �ö� ���̴ٺ��� �޸� �ʰ��� ���ɼ��������� �����ϰ� �����ؾ���
		//�ν��Ͻ��� = �޸𸮿� �ٷοö󰡰�
		String carColor = Car.color;
		
		System.out.println(carColor);
		System.out.println("------------------------");
		
		
		//���� �޼ҵ� ���
		Car.colorInfo();
		System.out.println("------------------------");
		
		
		/*
		 * //�ν��Ͻ� ��� ��� Car car = new Car(); String carCompany = car.company;
		 * System.out.println(carCompany);
		 * System.out.println("------------------------");
		 * 
		 * car.companyInfo(); System.out.println("------------------------");
		 * 
		 * Car car1 = new Car("Samsung"); car1.companyInfo();
		 * System.out.println("------------------------");
		 */
	}

}
