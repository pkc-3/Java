package sub2;

import sub1.Apple;

/*
 * 날짜 : 2021/05/25
 * 이름 : 고현석
 * 내용 : 자바 내장클래스(기본 API) 실습하기
 */
public class ClassTest {
	public static void main(String[] args) {
		//Class 클래스 : 객체를 동적 생성할 때 사용하는
		
		//정적 객체
		Apple a1 = new Apple("한국", 3000);
		a1.toString();
		
		//동적 객체
		
		try {
			Class cls = Class.forName("sub1.Apple");
			Apple a2 = (Apple)cls.newInstance();
			
			a2.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
