package ch04;

public class P56 {
	public static void main(String[] args) {
		
		int a = 5;
		System.out.println("+a = " + +a);
		System.out.println("-a = " + -a);
		
		a = -5;
		System.out.println("+a = " + +a);
		System.out.println("-a = " + -a);
		
		System.out.println("============�ι�° ������");
		
		int c = 10;
		int b = ++c;
		
		System.out.println("�������� ��� : "+b);
		
		int x = 10;
		int y = x++;
		System.out.println("�������� ��� : "+y);
		System.out.println("x : "+x);
		
		System.out.println("============����° ������");
		
		int d = 10;
		d++;
		System.out.println("d++ : "+d);
		int e = 10;
		e += 1;
		System.out.println("e += 1 : " +e);
		int f =10;
		f = f + 1;
		System.out.println("f = f + 1 : " +f);
	}
}
