package Day02;

public class Car {

	String company;
	String color; 
	int price;
	String model;
//	public Car() {
//	}
	
	public Car() {
		company="����";
		color = "����";
		price = 30000000;
	
		System.out.println("�⺻ ������ ȣ��");
	}
	
	public Car(String mod) {
		this(); // �⺻ ������ ȣ�� this() �޼ҵ带 ���� �ٸ� ������ ȣ��
		model = mod; 
		
		System.out.println("�� ��° ������ ȣ��");
	}
	
	public Car(String mod, String col, int pri) {
		this(); // �⺻ ������ ȣ�� this() �޼ҵ带 ���� �ٸ� ������ ȣ��
		// �������� �����ϰ� ����, ��, ���� �ٸ� ��
		// �ߺ��Ǵ� �ڵ带 �����Ͽ� �ҽ��ڵ� ����ȭ�ϱ� ����
		model = mod;  // �̷��� �����ε� ��, ����, ������ �ٸ� ��ü�� ��� �����Ҽ��ְ���??
		price = pri;
		color = col; 
		
		System.out.println("�� ��° ������ ȣ��");
	}
	
	
	public Car(String company, String color, int price, String model) {
		this.company=company;
		this.color=color;
		this.price=price;
		this.model=model;
	}
	
	
	//�޼ҵ带 ���� �� ���� ��ȯ ���� � Ÿ������ ������� ��
	//public add(int a, int b) {
	//	int c = a + b; 
	//	return c;
	//}
	// void : ��ȯ ���� ���� �޼ҵ�
	public void carInfo() { // void �� ���°� �޼ҵ�� �׻� ���ϰ��� ��ȯ�ؾ���
		//this ��ü�� ���� ���� Ŭ������ �Ӽ� �� ����
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
