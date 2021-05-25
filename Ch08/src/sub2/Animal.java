package sub2;

public class Animal {
	
	public void move() {
		System.out.println("Animal move...");
	}
	
	public void hunt() {}//추상 메서드 쓰려면 클래스도 추상으로 선언해야 쓸수있다.
	//오버라이드 당해야 하기 때문에 선언함. PolyTest에서 (15줄~17줄) Animal로 선언하면
	//move랑 hunt 둘다 오버라이드 되어있어야 함.
}
