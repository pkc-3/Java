package ch07;

public class Singleton {
	// static ����
	private static Singleton instance = new Singleton();
	
	// �����ڿ� private ���� ������
	private Singleton() {
		System.out.println("��ü ����");
	}
	
	//static �޼���
	public static Singleton getInstance() {
		System.out.println("��ü ����");
		return instance;
	}
}
