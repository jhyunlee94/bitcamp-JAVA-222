package Day04;

public class _09_reasonOfTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Driver driver = new Driver();
		Vihicle vi = new Vihicle();
		
		
		//�Ű������� �ڽİ�ü ����
		//���޵� �ڽİ�ü�� �θ�ü ���·� ����ȯ
		//��������� �ڽİ�ü�� �޼ҵ尡 ȣ��
		driver.drive(taxi);
		
		System.out.println("----------------");
		
		driver.drive(bus);
		
		driver.drive(vi);
	}

}
