package sub1;
/*
 * ��¥ : 2021/05/20
 * �̸� : ������
 * ���� : �ڹ� �����ε�(����) �޼���(�Լ�) �ǽ��ϱ� 
 * 
 */
public class MethodOverloadTest {

	public static void main(String[] args) {
		int r1 = add(1);
		int r2 = add(2,3);
		String r3 = add("ȫ�浿");
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
	}//main end
	
	//�̸��� �Ȱ��� �Ÿ� overload �޼����� �� : ��Ÿũ����Ʈ �����ε� ����
	
	public static int add(int num) {
		return num++;
		
	}
	public static int add(int x, int y) {
		return x+y;
	}
	public static String add(String str) {
		return str+"�� �ݰ����ϴ�.";
	}
	
}
