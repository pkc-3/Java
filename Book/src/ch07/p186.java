package ch07;

public class p186 {
	public static void main(String[] args) {
		// Singleton s = new Singleton(); //에러발생
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	}
}
