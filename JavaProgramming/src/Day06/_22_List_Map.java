package Day06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _22_List_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//만약에 DB에서 사용자정보 가져온다면 한명의 사용자 정보가 Map에 담긴다 생각하면 좋다
		//그 사용자 정보의 목록을 사용하고싶을땐 List Map을 사용해줘야한다		
		List<Map<String, String>> listMap = new ArrayList<Map<String, String>>();

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
		
		listMap.add(map);
		
		map = new HashMap<String, String>();
		
		map.put("id", "java");
		map.put("pw", "2222");
		map.put("name","bit2");
		map.put("email", "bbb@naver.com");
		
		listMap.add(map);
		/*
		 * list
		 * {
		 * 		{
		 * 			"id" : "bit",
		 * 			"pw" : "1111",
		 * 			"name" : "bit1",
		 * 			"email : "aaa@naver.com"
		 * 		},
		 * 		{
		 * 			"id" : "java",
		 * 			"pw" : "2222",
		 * 			"name" : "bit2",
		 * 			"email : "bbb@naver.com"
		 * 		}
		 * }
		 * 
		 * 
		 */
		//리스트에 에서 list 꺼내고 그 다음에 Map 에서 key 값을 꺼내옴
		for(int i = 0; i < listMap.size(); i++) {
			System.out.println(listMap.get(i).get("id"));
		}
		

	}

}
