package Day06;

import java.util.ArrayList;
import java.util.List;

public class _17_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		
		
		// list = ["java", "JDBC", "Servlet/JSP"];
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase"); // 지정된 index에 객체로_객체 자체로도 가능
		list.add("MyBatis");
		
		System.out.println("ArrayList list의 사이즈는 : " + list.size());
		System.out.println("---------------------------\n");
		// list = ["java", "JDBC", "DataBase" ,"Servlet/JSP"];
		// int[] intArr = [1, 2, 3];
		// intArr[1] = 4;
		// intArr = [1, 4, 3];
		String str = list.get(2);
		System.out.println(str);
		System.out.println("---------------------------\n");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번 째에 저장된 객체" + list.get(i));
		}
		System.out.println("---------------------------\n");
		
		
		list.remove(2);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번 째에 저장된 객체" + list.get(i));
		}
		System.out.println("---------------------------\n");
		
	}

}
