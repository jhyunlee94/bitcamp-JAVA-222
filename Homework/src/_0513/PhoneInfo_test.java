package _0513;

public class PhoneInfo_test {

	String name;
	String phoneNumber;
	String birthDay;
	
	public PhoneInfo_test() {
		
	}
	
	public PhoneInfo_test(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public PhoneInfo_test(String name, String phoneNumber, String birthDay) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthDay = birthDay;
	}
	
	public void showPhoneInfo( ) {
		System.out.println("�̸� : " + this.name);
		System.out.println("��ȭ��ȣ : " + this.phoneNumber);
		System.out.println("������� : " + this.birthDay);
	}
	
}
