package Day06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _20_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set은 중복값이 없을때 순서가 정해져있을때하고
		//그 이외에는 ArrayList, LinkedList를 주로한다.
		
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		//중복값 저장 안됨
		set.add("java");
		set.add("MyBatis");
		
		
		System.out.println("총 객체 수 : " + set.size());
		/*
		 * Iterator에서 제공하는 메소드 
		 * hasNext() : 다음에 꺼내올 객체가 있는지 여부 판단(있으면 true, 없으면 false)
		 * next() : Set컬렉션에서 객체 하나를 꺼내옴 
		 * remove() : Set컬렉션에서 객체 하나 제거
		 */
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str1 = iterator.next();
			if(str1.equals("MyBatis")) {
				System.out.println(str1);
			}
		}
		
		set.remove("JDBC");
		
		System.out.println("총 객체 수 : " + set.size());
		
		iterator = set.iterator(); 
		for(String str : set) {
			System.out.println(str);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		} else {
			System.out.println("비어 있지 않음");
		}
	}

}
