package Day01;

import java.util.Scanner;

public class _09_switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String grade;
	//	char grade = 'A';
			
			while(true) {
				grade = sc.nextLine();
				
				if(grade.equals("q")) {
					System.out.println("종료합니다.");
				break;
			}
			//grade 값에 따라 실행되는 내용이 변경
			switch(grade) {
			case "A" :
				System.out.println("90점 이상입니다.");
				break;
			case "B" : 
				System.out.println("90점 미만 80점 이상입니다.");
				break;
			case "C" :
				System.out.println("80점 미만 70점 이상입니다.");
				break;
			case "D" :
				System.out.println("70점 미만입니다.");
				break;
			}
		}
		
	}

}
