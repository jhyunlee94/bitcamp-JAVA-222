package Day02;

//1. Ŭ���� ����(��ü�� ���赵 ����)
public class Tv {
	//��ü�� �Ӽ� ���� 
//	String company = "Samsung";
	String company;
	//	int price = 1000000;
	int price;
	int size = 47;
	int weight = 2000;
	
	//Speaker ��ü ����
	Speaker speaker = new Speaker();
	
	//�⺻ ������ �޼ҵ� �����Ǿ� �ִ� ���·� Ŭ������ �������
//	public Tv() {} 
	
	//�⺻ ������ ���� ������
	//������ �޼ҵ忡�� ��ü �Ӽ������� �ʱ�ȭ ����
	public Tv() {
		company = "LG";
		price = 30000000;
		System.out.println("Tv ��ü ����");
	}
	
	// ����� ���� ������ �Լ�
	//���޹��� ���� ������ �Ӽ� ���� �ʱ�ȭ �� �� �ִ�.
	public Tv(String com, int pri) {
		company = com;
		price = pri;
		System.out.println("����� ���� ������ ȣ��");
	}
	
	public Tv(String com, int pri, int si) { // �̷��� �޼ҵ��� ���� ���� ������ �����Ͽ� �޼ҵ� �������ϴ°� �����ε�
//		this(com,pri); // �̰Ŵ� �ι�° TV ���ڰ������� �����ϴ°���
		
		this.company=com;
		
		
		System.out.println("����� ���� ������ ȣ��");
	}
	
	
	//���۵��� �޼ҵ�� �������
	//��ü�� ���۵�
	void turnOn() {
		System.out.println("������ �Ҵ�.");
	}
	
	void turnOff() {
		System.out.println("������ ����.");
	}
	
	void changChannel() {
		System.out.println("ä���� �����Ѵ�.");
	}
	
//	void changeVolumn() {
//		System.out.println("������ �����Ѵ�.");
//	}

	//Speaker ��ü �޼ҵ� ���
	void volumnUp() {
		speaker.volumnUp();
	}
	
	void volumnDown() {
		speaker.volumnDown();
	}
	
}
