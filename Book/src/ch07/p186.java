package ch07;

public class p186 {
	public static void main(String[] args) {
		// Singleton s = new Singleton(); //�����߻�
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	}
}
