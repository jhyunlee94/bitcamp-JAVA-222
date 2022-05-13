package Day04;

public class Driver {

	//1. 매개변수를 부모객체로 선언하므로서 
	//	 다양한 자식객체들을 매개변수로 받을 수 있게 되고
	// 	 매개변수로 받은 자식객체들에 따라 결과값이 달라짐
	// bus가 Vihicle형태로 형변환
	// 매개변수가 Vihicle객체 형태
	//Bus, Taxi가 결국
	//매개변수에 Vihicle의 형태를 가지고 있는 객체는 모두 가능
	// Vihicle, Bus, Taxi
	// 여러개의 값으로 가지고싶을때 이렇게하는겁니다.
	
	public void drive(Vihicle vihicle) {
		vihicle.run();
	}
	
	// Vihicle 을 줌으로써 
	// bus나 taxi 에 vihile 을 가지고 있기때문에 
	// 호출할수있는거다
	
	
	
	//오버로딩이 늘어나면 다형성을 이룰수가 없기때문에
	//저 매개변수를 부모 객체로 받아서 버스건, 택시건 다 사용할수있게하는거다.
//	public void drive(Bus bus) {
//		bus.run();
//	}
//	
//	public void drive(Taxi taxi) {
//		taxi.run();
//	}
	
	//예시
	//add 함수를 호출하면은 정수형 값을 두개를 받아서 
	//이 메소드에 넣어주는거예요
	public int add(int a, int b) {
		return a + b;
	}
	
}
