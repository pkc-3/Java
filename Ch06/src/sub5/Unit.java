package sub5;

//추상클래스
// - 1개 이상 추상메서드를 갖는 클래스, 객체 생성 안됨
// - 추상을 위한 클래스
// - 상속을 위한 클래스
public abstract class Unit {
	//abstract 추상클래스
	
	public void move() {
		System.out.println("Unit move...");
	}
	public abstract void attack(); 
	//abstract 추상메서드
	
}
