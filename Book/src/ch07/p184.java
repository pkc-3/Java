package ch07;

public class p184 {
	public static void main(String[] args) {
		ClassB cb = new ClassB();
		cb.print();
	}
	
	public void print() {
		System.out.println("����� Ŭ����A");
	}
	
}
class ClassB{
	void print() {
		System.out.println("����� Ŭ����B");
	}
}