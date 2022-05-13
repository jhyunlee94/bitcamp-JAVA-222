package Day04;

public class _09_reasonOfTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Driver driver = new Driver();
		Vihicle vi = new Vihicle();
		
		
		//매개변수로 자식객체 전달
		//전달된 자식객체가 부모객체 형태로 형변환
		//오버라딩된 자식객체의 메소드가 호출
		driver.drive(taxi);
		
		System.out.println("----------------");
		
		driver.drive(bus);
		
		driver.drive(vi);
	}

}
