package _0511;

public class _17_middle03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. 20�� �迭�� �����ϼ���
    		 20���� ���� ������ �̿��ؼ� 0 ~ 100������ ������ ä���ְ�
    		 ���� �ε����� Ȧ����°�� �տ������� ����ϰ�
    		 ¦����°�� �ڿ������� ����ϼ���*/
		int[] nums = new int[20];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 101);
		}
		
		for(int j = 0; j < nums.length; j++) {
			if(j % 2 == 1) {
				System.out.print(nums[j] + " ");
			
			} else {
	
				System.out.print(nums[nums.length - 2 - j] +" ");
			}
		}
	}

}
