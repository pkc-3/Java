package sub5;

public class AbstractTest {
	public static void main(String[] args) {
//		Unit unit = new Unit(); 추상클래스에서 객체생성 불가
		
		Unit marin = new Marin();
		Unit zealot = new Zealot();
		Unit zergling = new Zergling();
		
		marin.move();
		zealot.move();
		zergling.move();
		
		marin.attack();
		zealot.attack();
		zergling.attack();
		
	}
}
