package Day03;

import java.util.Scanner;


//��Ű������ ��� Ŭ������ ������ �� �ִ�.
//import Day03.com.test.*;
//import ����Ű ctrl + shift + o
//���� ��Ű������ Ŭ���� �ƴ� ��� import���� ���
//import���� ��� �� ��Ȯ�� ����� Ŭ������ �����ϰų�
import Day03.com.test.test;


public class _05_package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test.num �� final �� �ƴϰ� static �̱⿡ Ŭ������.�Ӽ������� ���氡��
		test.num = 100;
		
		System.out.println(test.num);
		
		Scanner sc = new Scanner(System.in);
	}

}
