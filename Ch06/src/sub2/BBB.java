package sub2;

//public final class BBB extends AAA  final 더이상 상속 안되게 막음.
public class BBB extends AAA {

	@Override
	//public final void method1() final 더이상 Override 안되게 막는다.
	public void method1() { 
		System.out.println("BBB - method1...");
	}
	//Overload(int 때문에 override 안됨)
	public void method2(int a) {
		System.out.println("BBB - method2...");
	}
	//Overload
	public void method3() {
		System.out.println("BBB - method3...");
	}

}
