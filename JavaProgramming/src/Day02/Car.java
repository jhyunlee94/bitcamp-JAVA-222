package Day02;

public class Car {

	String company;
	String color; 
	int price;
	String model;
//	public Car() {
//	}
	
	public Car() {
		company="현대";
		color = "레드";
		price = 30000000;
	
		System.out.println("기본 생성자 호출");
	}
	
	public Car(String mod) {
		this(); // 기본 생성자 호출 this() 메소드를 통한 다른 생성자 호출
		model = mod; 
		
		System.out.println("두 번째 생성자 호출");
	}
	
	public Car(String mod, String col, int pri) {
		this(); // 기본 생성자 호출 this() 메소드를 통한 다른 생성자 호출
		// 현대차만 생성하고 가격, 모델, 색상만 다를 때
		// 중복되는 코드를 제거하여 소스코드 간략화하기 위함
		model = mod;  // 이러면 현재인데 모델, 가격, 색상이 다른 객체를 계속 생성할수있겠죠??
		price = pri;
		color = col; 
		
		System.out.println("두 번째 생성자 호출");
	}
	
	
	public Car(String company, String color, int price, String model) {
		this.company=company;
		this.color=color;
		this.price=price;
		this.model=model;
	}
	
	
	//메소드를 정의 할 때는 반환 값이 어떤 타입인지 정해줘야 됨
	//public add(int a, int b) {
	//	int c = a + b; 
	//	return c;
	//}
	// void : 반환 값이 없는 메소드
	public void carInfo() { // void 가 들어가는거 메소드는 항상 리턴값을 반환해야함
		//this 객체를 통한 현재 클래스의 속성 값 접근
		System.out.println(this.company);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.model);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", color=" + color + ", price=" + price + ", model=" + model + "]";
	}
	
}
