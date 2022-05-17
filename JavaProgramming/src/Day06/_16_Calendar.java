package Day06;

import java.util.Calendar;

public class _16_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getInstance() : 현재 운영체제에 설정되어있는 시간대를 기준으로 객체를 하나 생성
		Calendar now = Calendar.getInstance();
		
		//년도 정보 추출
		int year = now.get(Calendar.YEAR);
		
		//월 정보 추출(0 ~ 11까지 리턴)
		int month = now.get(Calendar.MONTH) + 1;
		
		//일 정보 추출
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		//요일 정보 추출(0 : 일요일 ~ 6 : 토요일)
		int weekDay = now.get(Calendar.DAY_OF_WEEK);
		String strWeekDay = "";
		
		
		//추출한 요일정보 문자열로 변환
		switch(weekDay){
		case Calendar.MONDAY:
			strWeekDay = "월";
			break;
		case Calendar.TUESDAY:
			strWeekDay = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeekDay = "수";
			break;
		case Calendar.THURSDAY:
			strWeekDay = "목";
			break;
		case Calendar.FRIDAY:
			strWeekDay = "금";
			break;
		case Calendar.SATURDAY:
			strWeekDay = "토";
			break;
		case Calendar.SUNDAY:
			strWeekDay = "일";
			break;
		}
		
		//오전, 오후 정보 추출
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = "";
		
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
	
		//시간 정보 추출
		//HOUR_OF_DAY : 0 ~ 23시 까지 리턴  
		int hour = now.get(Calendar.HOUR);
		if(hour == 0) {
			hour = 12;
		}
		//분 정보 추출
		int minute = now.get(Calendar.MINUTE);
		//초 정보 추출
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year +"년 " + month +"월 "	+ day + "일 ");
		System.out.println(strWeekDay + "요일 " + strAmPm);
		System.out.println(hour + "시 " + minute + "분 " + second +"초 ");
	
	}

}
