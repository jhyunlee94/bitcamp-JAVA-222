package Day02;

import java.util.Calendar;

public class _05_calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calendar 객체 초기화
		Calendar cal = Calendar.getInstance();
		
		
		//현재 년도 값
		int year = cal.get(Calendar.YEAR);
		
		//현재 월 값 반환하는데 0~11까지 반환해서 +1 하는거임
		int month = cal.get(Calendar.MONTH) +1;
		
		//현재 일 값 반환
		int weekday = cal.get(Calendar.DAY_OF_MONTH);
		
		//현재 요일 값 반환(일요일(1) ~ 토요일(7)) 
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		//현재 시간 반환
		int hour = cal.get(Calendar.HOUR);
		
		//현재 분 반환
		int minute = cal.get(Calendar.MINUTE);
		
		//현재 초 반환
		int second = cal.get(Calendar.SECOND);
		
		//요일 숫자 변환 switch-case
		String korDayOfWeek = "";
		switch(day) {
		case 1:
			korDayOfWeek = "일";
			break;
		case 2:
			korDayOfWeek = "월";
			break;
		case 3:
			korDayOfWeek = "화";
			break;
		case 4:
			korDayOfWeek = "수";
			break;
		case 5:
			korDayOfWeek = "목";
			break;
		case 6:
			korDayOfWeek = "금";
			break;
		case 7:
			korDayOfWeek = "토";
			break;
	}
		
		System.out.println("지금은 " +year +"년 " +month +"월 "+weekday 
				+"일 " + day +"("+korDayOfWeek+")"+"요일 "+hour+"시간 "+ minute +"분 "+ second +"초"
				);
		
	}

}
