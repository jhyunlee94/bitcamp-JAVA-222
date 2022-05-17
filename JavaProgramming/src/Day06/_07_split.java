package Day06;

public class _07_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "010-1111-2222";
		String[] strArr = str1.split("-");
		
		
		// 제일 많이 쓰는게 숫자를 보낼때 , 나 - 가 들어올수도있기에
		// 이럴때 , 나 -를 제외하고
		// 다시 String을 붙히는 작업을 진행하고 DB에 저장해줘야할때
		// 제외하는 부분때 제일 많이 씀
		
		for(int i = 0 ; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

}
