package Day03;

public class _06_getterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserInfo userinfo = new UserInfo();
		
		
		//private�� ����� �ʵ忡 ���� ���� �Ұ�
		//userinfo.userName = "ȫ�浿"; 
		
		//private�� ����� �ʵ��� ���� �ٲܶ��� setter �޼ҵ带 ���
		userinfo.setPhoneNum("02-8888-9999");
		userinfo.setUserAge(17);
		userinfo.setUserName("ȫ�浿");
		
		userinfo.getPhoneNum();
		userinfo.getUserAge();
		userinfo.getUserName();
		
		//private�� ����� �ʵ� ���� ����� getter �޼ҵ� ���
		System.out.println("������� �̸��� : "+userinfo.getUserName());
		System.out.println("������� ����ó�� : "+userinfo.getPhoneNum());
		System.out.println("������� ���̴� : "+userinfo.getUserAge());
		
	}

}
