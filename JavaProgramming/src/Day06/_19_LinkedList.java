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
			aList.add(String.valueOf(i)); //valueOf�� ��Ʈ����ȯ�ϴ°���
		}
		endTime = System.nanoTime();
		
		System.out.println("ArrayList ��ü 1000000�� �߰��ϴµ� �ɸ� �ð� : " + (endTime - startTime) + "�������Դϴ�.");
		
		System.out.println("-------------------");
		startTime = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			lList.add(String.valueOf(i)); //valueOf�� ��Ʈ����ȯ�ϴ°���
		}
		endTime = System.nanoTime();
		
		System.out.println("LinkedList ��ü 1000000�� �߰��ϴµ� �ɸ� �ð� : " + (endTime - startTime) + "�������Դϴ�.");
		System.out.println("-------------------");
		
//		startTime = System.nanoTime();
//		System.out.println(lList.contains("50000")); //contains(Object o) : �Ű������� �Էµ� ��ü�� ����Ǿ� �ִ��� ����
//		endTime = System.nanoTime();
//		
//		System.out.println("LinkedList ��ü 50000�� �˻��ϴµ� �ɸ� �ð� : " + (endTime - startTime) + "�������Դϴ�.");
//		System.out.println("-------------------");
//		

		startTime = System.nanoTime();
		System.out.println(aList.get(80000));
		endTime = System.nanoTime();
		System.out.println("ArrayList 80000�� ° ��ҿ� �����ϴµ� �ɸ� �ð� : " + (endTime - startTime));
		
		
		startTime = System.nanoTime();
		System.out.println(lList.get(80000));
		endTime = System.nanoTime();
		System.out.println("LinkedList 80000�� ° ��ҿ� �����ϴµ� �ɸ� �ð� : " + (endTime - startTime));
		
		
		startTime = System.nanoTime();
		for(int i = 1000; i < 5000; i++) {
			aList.add(i, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 80000�� ° ��ҿ� �����ϴµ� �ɸ� �ð� : " + (endTime - startTime));
		
		
		startTime = System.nanoTime();
		for(int i = 1000; i < 5000; i++) {
			lList.add(i, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 80000�� ° ��ҿ� �����ϴµ� �ɸ� �ð� : " + (endTime - startTime));
		
	}

}
