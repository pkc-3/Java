package sub2;
/*
 * 날짜 : 2021/05/24
 * 이름 : 고현석
 * 내용 : 자바 오버라이드 메서드 실습하기 //상속 받은 마지막꺼로 진행된다. 오버라이드(같은 것 덮어쓰기) AAA->BBB->CCC CCC에서 전에 중복된거를 덮어쓴다.
 * 
 * Override 메서드
 *  - 부모클래스 메서드를 자식 클래스에서 다시 정의하는 메서드(재정의 메서드)
 *  - 자식클래스에서 부모클래스의 메서드를 덮어씌운다.
 */
public class OverrideTest {
	public static void main(String[] args) {
		
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method2(100);
		c.method3();
		c.method3(200);
		
		/*final 실습
		 * - final 변수 : 상수
		 * - final 메서드 : 오버라이드 금지
		 * - fianl 클래스 : 상속금지
		*/
		final int NUM = 1;
		//num += 1;
		
		
	}

}
