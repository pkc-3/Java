package sub5;
/*
 * ��¥ : 2021/05/26 
 * �̸� : ������
 * ���� : Math Test �ǽ��ϱ�
 */
public class MathTest {
	public static void main(String[] args) {
		
		//Math math = new Math(); ��ü ������ �ʿ� ���� �׳� ���� ��
		
		System.out.println("PI�� :"+Math.PI);
		System.out.println("���밪 :"+Math.abs(-5));
		System.out.println("���밪 :"+Math.abs(-3.14));
		System.out.println("������ :"+Math.sqrt(9));
		System.out.println("�ø��� :"+Math.ceil(1.2));
		System.out.println("�ø��� :"+Math.ceil(1.8));
		System.out.println("������ :"+Math.floor(1.2));
		System.out.println("������ :"+Math.floor(1.8));
		System.out.println("�ݿø��� :"+Math.round(1.2));
		System.out.println("�ݿø��� :"+Math.round(1.8));
		
		//random
		double num1 = Math.random();
		System.out.println("num1 : "+num1);
		
		double num2 = num1 * 10;
		System.out.println("num2 : "+num2);
		
		double num3 = Math.ceil(num2); //�Ҽ��� ���� �ø� �ڸ��� ���� ����
		System.out.println("num3 : "+num3);
		
		//1~45���� �ǽ�
		double num = Math.ceil(Math.random()*45);
		System.out.println("1 ~ 45 ���� ������ ���� : "+num);
	}
}
