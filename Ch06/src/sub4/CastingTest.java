package sub4;
/*
 * ��¥ : 2021/05/25
 * �̸� : ������
 * ���� : �ڹ� ĳ����(����ȯ) �ǽ��ϱ�
 * 
 * 
 */

import sub3.Animal;
import sub3.Tiger;
import sub3.Eagle;
import sub3.Shark;

public class CastingTest {
	public static void main(String[] args) {
		//ĳ���� (����ȯ)
		int num1 = 1;
		double num2 = num1;
		int num3 = (int)num2;
//ū �׸�(double)���� �����׸�(int)���� ���� Ÿ�� ���� �������
		
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
		System.out.println("num3 :"+num3);
		
		//��ĳ����(ū�׸����� �ٲ�) Animal �� �θ�
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		//�ٿ�ĳ����(�����׸����� �ٲ�)
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		//instanceof
		if(a1 instanceof Tiger) {
			System.out.println("a1�� Tiger �Դϴ�.");
		}
		else if(a1 instanceof Eagle) {
			System.out.println("a1�� Eagle �Դϴ�.");
		}
		else if(a1 instanceof Shark) {
			System.out.println("a1�� Shark �Դϴ�.");
		}
	}
}
