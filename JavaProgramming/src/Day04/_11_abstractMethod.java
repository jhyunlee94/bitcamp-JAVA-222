package Day04;

public class _11_abstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� ���� ���
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("-------------------");
		
		//�߻�Ŭ������ ��ü�� �����ȵ����� �ڽİ�ü�� ����ȯ�Ͽ� ���԰���
		// Animal animal = new Animal(); -----> �����߻�
		Animal animal = null;
		
		//�߻�Ŭ������ �ڽİ�ü�� �־ �������̵��� �޼ҵ嵵 ��밡��
		
		//�ڽİ�ü�� �������̵��� �޼ҵ� ȣ��
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("-------------------");
		//�ڽİ�ü�� �޾Ƽ� �ڵ����� �θ�ü�� ����ȯ�ȴ����� 
		//�θ�ü�� ���带 ȣ���ؼ� �ڽİ�ü�� sound�� ȣ���ϰ� ��
		//�Ű������� ���޵� �ڽİ�ü�� �ڵ����� ����ȯ�ǰ�
		//�ڽ��� ��ü�� �������̵��� �޼ҵ� ȣ��
		animalSound(new Dog());
		animalSound(new Cat());
		
		
	}

	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}
