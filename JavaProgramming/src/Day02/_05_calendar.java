package Day02;

import java.util.Calendar;

public class _05_calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calendar ��ü �ʱ�ȭ
		Calendar cal = Calendar.getInstance();
		
		
		//���� �⵵ ��
		int year = cal.get(Calendar.YEAR);
		
		//���� �� �� ��ȯ�ϴµ� 0~11���� ��ȯ�ؼ� +1 �ϴ°���
		int month = cal.get(Calendar.MONTH) +1;
		
		//���� �� �� ��ȯ
		int weekday = cal.get(Calendar.DAY_OF_MONTH);
		
		//���� ���� �� ��ȯ(�Ͽ���(1) ~ �����(7)) 
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		//���� �ð� ��ȯ
		int hour = cal.get(Calendar.HOUR);
		
		//���� �� ��ȯ
		int minute = cal.get(Calendar.MINUTE);
		
		//���� �� ��ȯ
		int second = cal.get(Calendar.SECOND);
		
		//���� ���� ��ȯ switch-case
		String korDayOfWeek = "";
		switch(day) {
		case 1:
			korDayOfWeek = "��";
			break;
		case 2:
			korDayOfWeek = "��";
			break;
		case 3:
			korDayOfWeek = "ȭ";
			break;
		case 4:
			korDayOfWeek = "��";
			break;
		case 5:
			korDayOfWeek = "��";
			break;
		case 6:
			korDayOfWeek = "��";
			break;
		case 7:
			korDayOfWeek = "��";
			break;
	}
		
		System.out.println("������ " +year +"�� " +month +"�� "+weekday 
				+"�� " + day +"("+korDayOfWeek+")"+"���� "+hour+"�ð� "+ minute +"�� "+ second +"��"
				);
		
	}

}
