package _0513;

public class DecisionBall {

	GeneratorThreeNum g = new GeneratorThreeNum();
	BaseBallMenu b = new BaseBallMenu();
	//스트라이크, 볼 판단하는 역할
	int strike = 0;
	int ball = 0;
	
	public void decision() {
		for(int i = 0; i < g.randomArr.length; i++) {
			for(int j = 0; j< b.inputArr.length; j++) {
				if(g.randomArr[i] == b.inputArr[j]) { // 같은 숫자
					if(i == j) { // 동일 자리    위 두개 if로 인해 같은 숫자 동일한 자리 즉, 1스트라이크
						strike++;
					}else { // 이외엔 ball 처리
						ball++;
					}
				}
			}
		}
		System.out.println("==>"+strike+"스트라이크" +ball +"볼");
		
		if(strike == 3) {
			System.out.println("삼진아웃");
		}
	}
}
