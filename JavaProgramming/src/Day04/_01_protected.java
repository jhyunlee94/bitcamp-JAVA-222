package Day04;

public class _01_protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SamsungTv sTv = new SamsungTv();
		
		System.out.println("---------------------");
		
		//protected로 선언된 필드나 메소드는
		//같은 패키지내의 클래스에서 사용가능
		//같은 패키지내의 클래스나 상속받은 자식 클래스에서 
		//사용할 수 있는 필드나 메소드를 선언할 때 사용
		Tv tv = new Tv();
		tv.company = "제조사 없음";
		System.out.println(tv.company);
	}

}
