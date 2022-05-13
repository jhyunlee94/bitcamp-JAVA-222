package _0512;

public class Cat extends Mammalia {
	
	public Cat(String sex, int size) {
		//super.Mamal(); 이라고 부모 생성자도 같이 호출됨
		this.sex=sex;
		this.size=size;
	}

	void a() {
		System.out.println("퉤");
	}
}
