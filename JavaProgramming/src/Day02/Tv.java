package Day02;

//1. 클래스 생성(객체의 설계도 만듬)
public class Tv {
	//객체의 속성 값들 
//	String company = "Samsung";
	String company;
	//	int price = 1000000;
	int price;
	int size = 47;
	int weight = 2000;
	
	//Speaker 객체 생성
	Speaker speaker = new Speaker();
	
	//기본 생성자 메소드 샹략되어 있는 상태로 클래스가 만들어짐
//	public Tv() {} 
	
	//기본 생성자 수정 가능함
	//생성자 메소드에서 객체 속성값들을 초기화 가능
	public Tv() {
		company = "LG";
		price = 30000000;
		System.out.println("Tv 객체 생성");
	}
	
	// 사용자 정의 생성자 함수
	//전달받은 인자 값으로 속성 값을 초기화 할 수 있다.
	public Tv(String com, int pri) {
		company = com;
		price = pri;
		System.out.println("사용자 정의 생성자 호출");
	}
	
	public Tv(String com, int pri, int si) { // 이렇게 메소드의 인자 값의 개수만 변경하여 메소드 재정의하는게 오버로딩
//		this(com,pri); // 이거는 두번째 TV 인자가같은거 생성하는거임
		
		this.company=com;
		
		
		System.out.println("사용자 정의 생성자 호출");
	}
	
	
	//동작들은 메소드로 만들어짐
	//객체의 동작들
	void turnOn() {
		System.out.println("전원을 켠다.");
	}
	
	void turnOff() {
		System.out.println("전원을 끈다.");
	}
	
	void changChannel() {
		System.out.println("채널을 변경한다.");
	}
	
//	void changeVolumn() {
//		System.out.println("볼륨을 조절한다.");
//	}

	//Speaker 객체 메소드 사용
	void volumnUp() {
		speaker.volumnUp();
	}
	
	void volumnDown() {
		speaker.volumnDown();
	}
	
}
