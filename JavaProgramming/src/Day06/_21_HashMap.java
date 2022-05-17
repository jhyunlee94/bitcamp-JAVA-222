package Day06;

import java.util.HashMap;
import java.util.Map;

public class _21_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//<key 값의 타입, value 값의 타입>
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("id", "bit");
		map.put("pw", "1111");
		map.put("name","bit1");
		map.put("email", "aaa@naver.com");
		
		
		/*
		 * map
		 * {
		 * 		"id" : "bit";,
		 * 		"pw" : "1111";,
		 * 		"name" : "bit1",
		 * 		"email" : "aaa@naver.com"
		 * }
		 * 이런 형태의 데이터 구조가 만들어지게 됩니다.
		 * 그래서 Map은 모든 동작을 Key 값으로 동작한다고 생각하는게 좋고
		 * 데이터 꺼내고 삭제도 Key를 사용함
		 */
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));
		
		System.out.println("-----------------------");
		System.out.println("저장된 객체의 총 개수 : " + map.size());
		System.out.println("-----------------------");
	
		map.remove("name");
		System.out.println("-----------------------");
		System.out.println("저장된 객체의 총 개수 : " + map.size());
		System.out.println("-----------------------");
	
	}
	
	

}
