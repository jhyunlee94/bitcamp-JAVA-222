package _0513;

public class DecisionBall {

	GeneratorThreeNum g = new GeneratorThreeNum();
	BaseBallMenu b = new BaseBallMenu();
	//��Ʈ����ũ, �� �Ǵ��ϴ� ����
	int strike = 0;
	int ball = 0;
	
	public void decision() {
		for(int i = 0; i < g.randomArr.length; i++) {
			for(int j = 0; j< b.inputArr.length; j++) {
				if(g.randomArr[i] == b.inputArr[j]) { // ���� ����
					if(i == j) { // ���� �ڸ�    �� �ΰ� if�� ���� ���� ���� ������ �ڸ� ��, 1��Ʈ����ũ
						strike++;
					}else { // �̿ܿ� ball ó��
						ball++;
					}
				}
			}
		}
		System.out.println("==>"+strike+"��Ʈ����ũ" +ball +"��");
		
		if(strike == 3) {
			System.out.println("�����ƿ�");
		}
	}
}
