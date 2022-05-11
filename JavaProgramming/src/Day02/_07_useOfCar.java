package Day02;

public class _07_useOfCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("Á¦³×½Ã½º", "°ËÁ¤",50000000);
		Car car2 = new Car("¾Æ¹Ý¶¼","»¡°­", 30000000);
		
		Car car3 = new Car("»ï¼º","³ë¶û",3000,"¸£³ë");
		
		System.out.println(car1.toString());
		System.out.println("----------------------");
		car1.carInfo();
		System.out.println("----------------------");
		System.out.println(car2.toString());
		System.out.println("----------------------");
		car2.carInfo();
		System.out.println("----------------------");
		
		
		System.out.println(car3.toString());
		System.out.println("----------------------");
	}

}
