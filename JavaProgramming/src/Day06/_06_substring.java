package Day06;

public class _06_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "111111-2222222";
		
		//인덱스 0~6까지의 문자열 자름
		String first = str1.substring(0,6);
		//인덱스 7부터 끝까지 문자열 자름
		String second = str1.substring(7);

		System.out.println(first);
		System.out.println(second);
	}

}
