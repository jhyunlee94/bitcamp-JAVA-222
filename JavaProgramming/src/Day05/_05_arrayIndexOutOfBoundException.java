package Day05;

public class _05_arrayIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//index가 0~2까지인 배열에서
		//index가 3인 요소에 접근 시
		//ArrayIndexOutOfBoundException 발생
		int[] intArr = new int[3]; 
		
		//Index 3 out of bounds for length 3
		System.out.println(intArr[3]);
	}

}
