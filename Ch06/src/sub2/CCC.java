package sub2;

public class CCC extends BBB {

	@Override
	public void method1() {
		System.out.println("CCC - method1...");
	}
	@Override //AAA�� method2 Override ��
	public void method2() {
		System.out.println("CCC - method2...");
	}
	@Override //AAA�� method3 Override ��
	public void method3(int a) {
		System.out.println("CCC - method3...");
	}
}
