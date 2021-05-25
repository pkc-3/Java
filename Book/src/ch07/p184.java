package ch07;

public class p184 {
	public static void main(String[] args) {
		ClassB cb = new ClassB();
		cb.print();
	}
	
	public void print() {
		System.out.println("여기는 클래스A");
	}
	
}
class ClassB{
	void print() {
		System.out.println("여기는 클래스B");
	}
}