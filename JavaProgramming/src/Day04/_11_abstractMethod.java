package Day04;

public class _11_abstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//원래 쓰던 방식
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("-------------------");
		
		//추상클래스는 객체로 생성안되지만 자식객체를 형변환하여 삽입가능
		// Animal animal = new Animal(); -----> 에러발생
		Animal animal = null;
		
		//추상클래스에 자식객체를 넣어서 오버라이딩된 메소드도 사용가능
		
		//자식객체에 오버라이딩된 메소드 호출
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("-------------------");
		//자식객체를 받아서 자동으로 부모객체로 형변환된다음에 
		//부모객체의 사운드를 호출해서 자식객체의 sound를 호출하게 됨
		//매개변수로 전달된 자식객체가 자동으로 형변환되고
		//자식의 객체에 오버라이딩된 메소드 호출
		animalSound(new Dog());
		animalSound(new Cat());
		
		
	}

	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}
