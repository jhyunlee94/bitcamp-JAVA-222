package Day06;


import Day03.Car;

public class _01_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Class ��ü ���
		//Class ��ü �̿� �� ������ Ŭ������ �⺻������ ������ �� �ִ�.
		Class cla1 = Car.class;
		System.out.println(cla1);
		System.out.println(cla1.getName());
		System.out.println();
		
		Car car = new Car();
		Class cla2 = car.getClass();
		System.out.println(cla2);		
		System.out.println(cla2.getSimpleName());
		System.out.println();
		
		try {
			Class cla3 = Class.forName("Day03.Car");	
			System.out.println(cla3.getPackageName());
		}catch(ClassNotFoundException ex) {
			System.out.println(ex.toString());
		}
		
		

		
	}

}
