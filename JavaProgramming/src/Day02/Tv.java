package Day02;

//1. 클래스 생성(객체의 설계도 만듬)
public class Tv {
	//객체의 속성 값들 
	String company = "Samsung";
	int price = 1000000;
	int size = 47;
	int weight = 2000;
	
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
	
	void changeVolumn() {
		System.out.println("볼륨을 조절한다.");
	}
}
