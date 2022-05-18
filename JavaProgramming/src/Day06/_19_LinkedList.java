package Day06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _19_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> aList = new ArrayList<String>();
		List<String> lList = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			aList.add(String.valueOf(i)); //valueOf는 스트링반환하는거임
		}
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 객체 1000000개 추가하는데 걸린 시간 : " + (endTime - startTime) + "나노초입니다.");
		
		System.out.println("-------------------");
		startTime = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			lList.add(String.valueOf(i)); //valueOf는 스트링반환하는거임
		}
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 객체 1000000개 추가하는데 걸린 시간 : " + (endTime - startTime) + "나노초입니다.");
		System.out.println("-------------------");
		
//		startTime = System.nanoTime();
//		System.out.println(lList.contains("50000")); //contains(Object o) : 매개변수로 입력된 객체가 저장되어 있는지 조사
//		endTime = System.nanoTime();
//		
//		System.out.println("LinkedList 객체 50000개 검색하는데 걸린 시간 : " + (endTime - startTime) + "나노초입니다.");
//		System.out.println("-------------------");
//		

		startTime = System.nanoTime();
		System.out.println(aList.get(80000));
		endTime = System.nanoTime();
		System.out.println("ArrayList 80000번 째 요소에 접근하는데 걸린 시간 : " + (endTime - startTime));
		
		
		startTime = System.nanoTime();
		System.out.println(lList.get(80000));
		endTime = System.nanoTime();
		System.out.println("LinkedList 80000번 째 요소에 접근하는데 걸린 시간 : " + (endTime - startTime));
		
		
		startTime = System.nanoTime();
		for(int i = 1000; i < 5000; i++) {
			aList.add(i, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 80000번 째 요소에 접근하는데 걸린 시간 : " + (endTime - startTime));
		
		
		startTime = System.nanoTime();
		for(int i = 1000; i < 5000; i++) {
			lList.add(i, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 80000번 째 요소에 접근하는데 걸린 시간 : " + (endTime - startTime));
		
	}

}
