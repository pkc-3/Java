package test3;

import java.util.Scanner;

/*
��¥ : OOOO/OO/OO
�̸� : ȫ�浿
���� : Ŭ���� ��� ��������
*/
class Rent {
	public void payment() {
		System.out.println("�Ӵ�Ḧ �޽��ϴ�.");
	}
}

class Landload extends Rent {
	
	public void getMoney() {
		System.out.println("�ǹ��� �Դϴ�.");
		payment();
	}
}

public class JavaTest06 {
	public static void main(String[] args) {
	
		Landload master = new Landload();
		master.getMoney();
		
	}	
}