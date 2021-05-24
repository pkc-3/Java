package sub2;

public class CCC extends BBB {

	@Override
	public void method1() {
		System.out.println("CCC - method1...");
	}
	@Override //AAA에 method2 Override 함
	public void method2() {
		System.out.println("CCC - method2...");
	}
	@Override //AAA에 method3 Override 함
	public void method3(int a) {
		System.out.println("CCC - method3...");
	}
}
